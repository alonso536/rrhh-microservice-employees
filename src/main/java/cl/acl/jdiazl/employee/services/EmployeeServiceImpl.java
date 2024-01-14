package cl.acl.jdiazl.employee.services;

import static cl.acl.jdiazl.employee.models.helpers.EmployeeHelper.buildEmployee;

import cl.acl.jdiazl.employee.models.dto.EmployeeDTO;
import cl.acl.jdiazl.employee.models.entities.Employee;
import cl.acl.jdiazl.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> findAll() {
        List<Employee> employees = employeeRepository.findEmployees();

        return employees.stream()
                .map((employee) -> buildEmployee(employee))
                .collect(Collectors.toList());
    }
}
