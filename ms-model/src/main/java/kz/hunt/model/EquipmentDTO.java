package kz.hunt.model;

import lombok.Data;

@Data
public class EquipmentDTO extends AbstractDTO {

    private String name;

    private Double cost;

    private String description;
}
