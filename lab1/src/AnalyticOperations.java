import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnalyticOperations {
    List<Employee> employees;
    public AnalyticOperations(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> findEmployeeByCompanyName(String companyName) {
        return employees.stream().filter(s -> s.getCompanyName().equals(companyName)).toList();
    }
    public List<Employee> sortEmployeesAlphabeticalBySurname() {
        return employees.stream().sorted(Comparator.comparing(Employee::getSurname)).toList();
    }

    public Map<String, List<Employee>> groupByPositionInCompany() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getPositionInCompany));
    }

    public Map<String, Long> countNumberOfEmployeesByPositionInCompany() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getPositionInCompany, Collectors.counting()));
    }

    @Override
    public String toString() {
        // TODO
        return String.format("");
    }
}
