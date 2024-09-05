package ci.ada.cantine.services;

import ci.ada.cantine.services.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    MenuDTO save(MenuDTO menuDTO);
    Optional<MenuDTO> findOne(Long id);
    MenuDTO update(MenuDTO menuDTO);
    List<MenuDTO> findAll();
    void delete(Long id);
    long countMenu();
}
