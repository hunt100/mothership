package kz.hunt.character.data.entity.unit;

import kz.hunt.character.data.entity.inventory.Backpack;
import kz.hunt.character.data.entity.skill.Skill;
import kz.hunt.character.data.entity.unit.enums.NpcType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue(NpcType.MERCENARY_VALUE)
@Getter @Setter
public class Mercenary extends NonPlayableCharacter {

    private Integer loyaltyDiceMultiplier;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double advance;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double salary;

    private String job;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "mercenary_skills",
            joinColumns = @JoinColumn(name = "mercenary_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills;

    @OneToOne
    @JoinColumn(name = "character_id")
    private Backpack backpack;

}
