package kz.hunt.character.mapper;

import kz.hunt.character.data.entity.mechanics.SpecialAbility;
import org.mapstruct.Mapper;

@Mapper
public interface TestMapper {

    SpecialAbilityDTO toDTO(SpecialAbility entity);
}
