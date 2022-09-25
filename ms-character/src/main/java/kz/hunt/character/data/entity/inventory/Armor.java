package kz.hunt.character.data.entity.inventory;

import kz.hunt.character.data.entity.inventory.enums.ItemType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ItemType.ARMOR_VALUE)
@Getter @Setter
public class Armor extends Equipment {

    private Integer additionalArmor;

    private String specialEffects;

}
