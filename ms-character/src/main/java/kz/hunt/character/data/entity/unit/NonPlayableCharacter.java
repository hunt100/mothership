package kz.hunt.character.data.entity.unit;

import kz.hunt.character.data.entity.unit.enums.NpcType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "npcs")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
@Getter @Setter
public class NonPlayableCharacter extends AbstractCharacter {

    @Column
    private Integer hits;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double combat;

    @Column(precision = 5, scale = 1)
    @Type(type = "big_decimal")
    private Double instinct;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, updatable = false, insertable = false)
    private NpcType type;

}
