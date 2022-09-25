package kz.hunt.character.data.entity.unit;

import kz.hunt.character.data.entity.inventory.Backpack;
import kz.hunt.character.data.entity.mechanics.LevelUp;
import kz.hunt.character.data.entity.profession.Profession;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "players")
@Getter @Setter
public class Player extends AbstractCharacter {

    private String rank;

    private String avatarUrl;

    private Integer xp;

    private Integer stress = 2;

    private Integer resolve = 0;

    private Integer maxHealth;

    private Integer currentHealth;

    private Integer strength;

    private Integer speed;

    private Integer intellect;

    private Integer combat;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double credits;

    @OneToMany
    @JoinColumn(name = "character_id")
    private Set<LevelUp> levelUps;

    @OneToOne
    private Profession profession;

    @OneToOne
    private Backpack backpack;

}
