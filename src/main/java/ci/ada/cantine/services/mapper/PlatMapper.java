package ci.ada.cantine.services.mapper;
import ci.ada.cantine.models.Plat;
import ci.ada.cantine.services.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO, Plat> {
}
