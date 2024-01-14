package cl.acl.jdiazl.employee.repositories;

import cl.acl.jdiazl.employee.models.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
