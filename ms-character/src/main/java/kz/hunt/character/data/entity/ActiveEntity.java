package kz.hunt.character.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter @Setter
public abstract class ActiveEntity extends BaseEntity {

    @Column(name = "enabled")
    private boolean enabled = true;

}
