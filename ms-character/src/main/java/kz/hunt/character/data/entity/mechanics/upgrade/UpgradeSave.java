package kz.hunt.character.data.entity.mechanics.upgrade;

import kz.hunt.character.data.entity.mechanics.enums.SaveThrowType;
import kz.hunt.character.data.entity.mechanics.enums.UpgradeFieldType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(UpgradeFieldType.SAVE_THROW_VALUE)
@Getter @Setter
public class UpgradeSave extends UpgradeField {

    @Enumerated(EnumType.STRING)
    private SaveThrowType first;

    @Enumerated(EnumType.STRING)
    private SaveThrowType second;

    private Integer value = 4;

}
