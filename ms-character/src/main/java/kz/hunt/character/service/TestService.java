package kz.hunt.character.service;

import kz.hunt.character.data.entity.mechanics.SpecialAbility;
import kz.hunt.character.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public void foo() {
        System.out.print(testMapper.toDTO(new SpecialAbility()));
    }
}
