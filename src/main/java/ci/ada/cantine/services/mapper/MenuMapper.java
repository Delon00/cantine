package ci.ada.cantine.services.mapper;

import ci.ada.cantine.models.Menu;
import ci.ada.cantine.services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface MenuMapper extends  EntityMapper<MenuDTO, Menu>{
}
