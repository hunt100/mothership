package kz.hunt.character.data.entity.mechanics;

import kz.hunt.character.data.entity.BaseEntity;
import kz.hunt.character.data.entity.mechanics.upgrade.UpgradeField;
import kz.hunt.character.data.entity.skill.Skill;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter
public class LevelUp extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "upgrade_field_id")
    private UpgradeField upgradeField;

    private boolean addResolve;
    private boolean removePhobia;
    private boolean heallAllStress;

    private Integer skillPoints;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "level_up_skills",
            joinColumns = @JoinColumn(name = "level_up_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> addedSkills;

}
