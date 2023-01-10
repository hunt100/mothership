package kz.hunt.model;

import lombok.Data;

@Data
public class SkillDependencyDTO extends AbstractDTO {

    private SkillDTO dependsOn;

    private SkillDTO mainSkill;

}
