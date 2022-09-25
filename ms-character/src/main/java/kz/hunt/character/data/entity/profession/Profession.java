package kz.hunt.character.data.entity.profession;

import kz.hunt.character.data.entity.ActiveEntity;
import kz.hunt.character.data.entity.skill.Skill;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "professions")
@Getter @Setter
public class Profession extends ActiveEntity {

    private String name;

    private String description;

    private Integer baseSanity;

    private Integer baseFear;

    private Integer baseBody;

    private Integer baseArmor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "profession_assigned_skills",
            joinColumns = @JoinColumn(name = "profession_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> assignedSkills = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "profession_exclusive_skills",
            joinColumns = @JoinColumn(name = "profession_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> exclusiveSkills = new HashSet<>();

    private Integer exclusiveSkillLimit;

    private Integer startPoints;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "profession_id")
    private Set<ProfessionBonus> bonuses = new HashSet<>();

}
