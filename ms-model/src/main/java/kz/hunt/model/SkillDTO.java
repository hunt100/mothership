package kz.hunt.model;

import lombok.Data;

import java.util.List;

@Data
public class SkillDTO extends AbstractDTO {

    private String name;

    private String shortDescription;

    private SkillLevel level;

    private Double bonusPercent;

    private Integer cost;

    private List<SkillDependencyDTO> skillDependencies;

    public enum SkillLevel {
        ADVANCED, EXPERT, MASTER
    }
}
