package kz.hunt.character.data.entity.profession;

import kz.hunt.character.data.entity.BaseEntity;
import kz.hunt.character.data.entity.mechanics.enums.CharacteristicType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter @Setter
public class ProfessionBonus extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CharacteristicType bonusFor;
    private Integer bonusValue;
    private String specialRules;

}
