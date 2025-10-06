import java.util.ArrayList;
import java.util.List;
import Exceptions.EmailAlreadyInUseException;

public class Company {
    private List<Employee> employees;
    private final String companyName;
    public Company(String companyName) {
        this.companyName = companyName;
        employees = new ArrayList<Employee>();
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public String getCompanyName() { return companyName; }

    public void addEmployee(String name, String surname, String emailAdress, Position position) {
        for (Employee e : employees) {
            if (e.getEmailAdress().equals(emailAdress)) {
                throw new EmailAlreadyInUseException("Pracownik o podanym mailu już istnieje!");
            }
        }
        Employee newEmployee = new Employee(name, surname, emailAdress, this.companyName, position);
        employees.add(newEmployee);
    }

    public List<Employee> getEmployeesInCompany() {
        return employees;
    }

    @Override
    public String toString() {
        // TODO
        return String.format("");
    }
}
