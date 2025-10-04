import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Exceptions.EmailAlreadyInUseException;

public class Company {
    private Set<Employee> employees;

    public Company() {
        employees = new HashSet<Employee>();
    }
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee newEmployee) {
        if (!employees.add(newEmployee)) {
            throw new EmailAlreadyInUseException("Employee with that email already exists");
        }
        employees.add(newEmployee);
    }

    public Set<Employee> getEmployeesInCompany() {
        return employees;
    }
}
