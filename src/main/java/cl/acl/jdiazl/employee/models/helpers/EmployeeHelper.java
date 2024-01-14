package cl.acl.jdiazl.employee.models.helpers;

import cl.acl.jdiazl.employee.models.dto.EmployeeDTO;
import cl.acl.jdiazl.employee.models.entities.Address;
import cl.acl.jdiazl.employee.models.entities.Employee;

public class EmployeeHelper {

    public static EmployeeDTO buildEmployee(Employee employee) {
        Address addressDB = employee.getAddress();
        StringBuilder address = new StringBuilder(addressDB.getStreet())
                .append(" ")
                .append(addressDB.getNumber())
                .append(" ")
                .append(addressDB.getCity().getName());

        String boss = (employee.getBoss() != null)
                ? employee.getBoss().getName() + " " + employee.getBoss().getLastname()
                : null;

        return EmployeeDTO.builder()
                .id(employee.getId())
                .name(employee.getName())
                .lastname(employee.getLastname())
                .email(employee.getEmail())
                .phone(employee.getPhone())
                .address(address.toString())
                .boss(boss)
                .job(employee.getJobId().toString())
                .department(employee.getJobId().toString())
                .birthdate(employee.getBirthdate())
                .hiredate(employee.getHiredate())
                .build();
    }
}
