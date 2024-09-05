package ci.ada.cantine.services.impl;

import ci.ada.cantine.models.Menu;
import ci.ada.cantine.repository.MenuRepository;
import ci.ada.cantine.services.MenuService;
import ci.ada.cantine.services.dto.MenuDTO;
import ci.ada.cantine.services.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;

    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        log.debug("Request to save Menu : {}", menuDTO);
        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);
        return menuMapper.toDto(menu);
    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        return null;
    }

    @Override
    public List<MenuDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public long countMenu() {
        return menuRepository.count();
    }
}
