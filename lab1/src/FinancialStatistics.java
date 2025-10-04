import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FinancialStatistics {
    private List<Employee> employees;
    public FinancialStatistics(List<Employee> employeeList) {
        this.employees = employeeList;
    }
    public Integer getAverageSalary() {
        return employees.stream().mapToInt(Employee::getSalary).sum() / employees.size();
    }

    public Optional<Employee> getHighestPaidEmployee() {
        return employees.stream().max(Comparator.comparing(Employee::getSalary));
    }
}
