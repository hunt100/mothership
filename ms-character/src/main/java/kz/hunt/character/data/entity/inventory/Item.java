package kz.hunt.character.data.entity.inventory;

import kz.hunt.character.data.entity.BaseEntity;
import kz.hunt.character.data.entity.inventory.enums.ItemType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
@Getter @Setter
public class Item extends BaseEntity {

    private String name;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double cost;

    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, updatable = false, insertable = false)
    private ItemType type;

}
