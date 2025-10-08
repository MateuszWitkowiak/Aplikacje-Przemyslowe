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
        Employee tempEmployee = new Employee(name, surname, emailAdress, this.companyName, position);
        if (employees.contains(tempEmployee)) {
            throw new EmailAlreadyInUseException("Pracownik o podanym mailu już istnieje!");
        }
        employees.add(tempEmployee);
    }

    @Override
    public String toString() {
        return String.format(
                "Company name: %s\nEmployees: %s",
                companyName,
                employees
        );
    }
}
