package kz.hunt.mscore;

import kz.hunt.character.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private EquipmentRepository equipmentRepository;
}
