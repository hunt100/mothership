package kz.hunt.character.data.entity.unit;


import kz.hunt.character.data.entity.mechanics.SpecialAbility;
import kz.hunt.character.data.entity.unit.enums.NpcType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue(NpcType.MONSTER_VALUE)
@Getter @Setter
public class Monster extends NonPlayableCharacter {

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double hp;

    @Column
    private Integer attack;

    @OneToMany
    @JoinColumn(name = "character_id")
    private Set<SpecialAbility> abilities;

}
