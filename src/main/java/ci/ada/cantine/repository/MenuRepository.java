package ci.ada.cantine.repository;

import ci.ada.cantine.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  MenuRepository extends JpaRepository<Menu, Long> {
}
