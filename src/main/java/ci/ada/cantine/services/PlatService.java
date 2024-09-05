package ci.ada.cantine.services;

import ci.ada.cantine.services.dto.MenuDTO;
import ci.ada.cantine.services.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);
    Optional<PlatDTO> findOne(Long id);
    PlatDTO update(PlatDTO platDTO);
    List<PlatDTO> findAll();
    void delete(Long id);
    long countPlat();
}
