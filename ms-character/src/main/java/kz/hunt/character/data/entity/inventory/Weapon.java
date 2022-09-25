package kz.hunt.character.data.entity.inventory;

import kz.hunt.character.data.entity.inventory.enums.ItemType;
import kz.hunt.common.RollType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ItemType.WEAPON_VALUE)
@Getter @Setter
public class Weapon extends Equipment {

    private RollType rollType;
    private Integer multiplier;
    private String criticalEffect;
    private String special;
    private Integer ammunition;

}
