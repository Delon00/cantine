package ci.ada.cantine.repository;

import ci.ada.cantine.models.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRepository extends JpaRepository<Plat, Long> {
}
