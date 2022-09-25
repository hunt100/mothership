package kz.hunt.character.data.entity.skill;

import kz.hunt.character.data.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "skill_dependencies")
@Getter @Setter
public class SkillDependency extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "depends_on_id")
    private Skill dependsOn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_skill_id")
    private Skill mainSkill;

}
