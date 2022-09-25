package kz.hunt.character.data.entity.inventory;

import kz.hunt.character.data.entity.inventory.enums.ItemType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ItemType.EQUIPMENT_VALUE)
public class Equipment extends Item {

}
