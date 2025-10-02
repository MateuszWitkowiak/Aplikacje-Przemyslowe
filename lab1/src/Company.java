import java.util.ArrayList;
import java.util.List;
import Exceptions.EmailAlreadyInUseException;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<Employee>();
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee newEmployee) {
        for (Employee e : employees) {
            if (e.getEmailAdress().equals(newEmployee.getEmailAdress())) {
                throw new EmailAlreadyInUseException("Pracownik o podanym mailu już istnieje!");
            }
        }
        employees.add(newEmployee);
    }
}
