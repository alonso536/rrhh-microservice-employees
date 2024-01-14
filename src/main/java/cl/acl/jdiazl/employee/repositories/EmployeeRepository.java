package cl.acl.jdiazl.employee.repositories;

import cl.acl.jdiazl.employee.models.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.firedate IS NULL")
    List<Employee> findEmployees();

    @Query("SELECT e FROM Employee e WHERE e.id = :id AND e.firedate IS NULL")
    Optional<Employee> findOneById(@Param("id") Long id);

    @Query("SELECT e FROM Employee e WHERE e.boss IS NULL")
    List<Employee> findBosses();
}
