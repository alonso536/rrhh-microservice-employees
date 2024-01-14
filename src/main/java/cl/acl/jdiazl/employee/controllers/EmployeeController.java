package cl.acl.jdiazl.employee.controllers;

import cl.acl.jdiazl.employee.models.dto.EmployeeDTO;
import cl.acl.jdiazl.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> index() {
        return employeeService.findAll();
    }
}
