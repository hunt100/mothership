package kz.hunt.character.data.entity.skill;

import kz.hunt.character.data.entity.ActiveEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "skills")
@Getter @Setter
public class Skill extends ActiveEntity {

    @Column
    private String name;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Enumerated(EnumType.STRING)
    private SkillLevel level;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double bonusPercent;

    @Column
    private Integer cost;

    @OneToMany(mappedBy = "mainSkill", cascade = CascadeType.ALL)
    private Set<SkillDependency> skillDependencies = new LinkedHashSet<>();
}
