package kz.hunt.character.data.entity.unit;

import kz.hunt.character.data.entity.ActiveEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter @Setter
public abstract class AbstractCharacter extends ActiveEntity {

    private String name;

    private String description;

}
