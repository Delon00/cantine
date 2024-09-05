package ci.ada.cantine.services.dto;

import ci.ada.cantine.models.Plat;

import lombok.Data;

@Data
public class MenuDTO {

    private Long id;

    private String creationDate;

    private Plat plat;
}
