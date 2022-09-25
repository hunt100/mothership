package kz.hunt.character.data.entity.mechanics.upgrade;

import kz.hunt.character.data.entity.mechanics.enums.CharacteristicType;
import kz.hunt.character.data.entity.mechanics.enums.UpgradeFieldType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue(UpgradeFieldType.CHARACTERISTIC_VALUE)
@Getter @Setter
public class UpgradeCharacteristic extends UpgradeField {

    private CharacteristicType first;

    private Integer firstValue = 5;

    @Column
    @Enumerated(EnumType.STRING)
    private CharacteristicType second;

    private Integer secondValue = 3;

}
