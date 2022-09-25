package kz.hunt.character.data.entity.mechanics;

import kz.hunt.character.data.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "special_abilities")
@Getter @Setter
public class SpecialAbility extends BaseEntity {

    @Column
    private String name;

    @Column
    private String description;

}
