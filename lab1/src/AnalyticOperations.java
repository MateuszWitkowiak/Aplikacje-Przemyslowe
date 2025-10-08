import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnalyticOperations {
    List<Employee> employees;
    public AnalyticOperations(List<Employee> employees) {
        this.employees = employees;
    }

    public Optional<List<Employee>> findEmployeeByCompanyName(String companyName) {
        return Optional.of(employees.stream().filter(s -> s.getCompanyName().equals(companyName)).toList());
    }
    public Optional<List<Employee>> sortEmployeesAlphabeticalBySurname() {
        return Optional.of(employees.stream().sorted(Comparator.comparing(Employee::getSurname)).toList());
    }

    public Optional<Map<String, List<Employee>>> groupByPositionInCompany() {
        return Optional.of(employees.stream().collect(Collectors.groupingBy(Employee::getPositionInCompany)));
    }

    public Optional<Map<String, Long>> countNumberOfEmployeesByPositionInCompany() {
        return Optional.of(employees.stream().collect(Collectors.groupingBy(Employee::getPositionInCompany, Collectors.counting())));
    }

    @Override
    public String toString() {
        return String.format(
                "Sorted by surname:\n%s\n\nGroup by position:\n%s\n\nCount by position:\n%s\n\nFind by company name:\n%s\n",
                sortEmployeesAlphabeticalBySurname(),
                groupByPositionInCompany(),
                countNumberOfEmployeesByPositionInCompany(),
                findEmployeeByCompanyName("Firma1")
        );
    }
}
