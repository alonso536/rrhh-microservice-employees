package cl.acl.jdiazl.employee.services;

import cl.acl.jdiazl.employee.models.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> findAll();
}
