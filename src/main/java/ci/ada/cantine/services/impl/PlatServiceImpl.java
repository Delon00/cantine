package ci.ada.cantine.services.impl;

import ci.ada.cantine.models.Menu;
import ci.ada.cantine.models.Plat;
import ci.ada.cantine.repository.PlatRepository;
import ci.ada.cantine.services.PlatService;
import ci.ada.cantine.services.dto.PlatDTO;
import ci.ada.cantine.services.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    private final PlatMapper platMapper;
    @Override
    public PlatDTO save(PlatDTO platDTO) {
        log.debug("Request to save Plat : {}", platDTO);
        Plat menu = platMapper.toEntity(platDTO);
        menu = platRepository.save(menu);
        return platMapper.toDto(menu);
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        return null;
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream()
                .map(platMapper::toDto)
                .toList();
    }

    @Override
    public void delete(Long id) {
        platRepository.deleteById(id);
    }

    @Override
    public long countPlat() {
        return platRepository.count();
    }
}
