package cl.acl.jdiazl.employee.repositories;

import cl.acl.jdiazl.employee.models.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
