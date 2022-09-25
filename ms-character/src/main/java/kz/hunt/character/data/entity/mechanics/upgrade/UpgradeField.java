package kz.hunt.character.data.entity.mechanics.upgrade;

import kz.hunt.character.data.entity.BaseEntity;
import kz.hunt.character.data.entity.mechanics.enums.UpgradeFieldType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "upgrade_fields")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
@Getter @Setter
public abstract class UpgradeField extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, updatable = false, insertable = false)
    private UpgradeFieldType type;
}
