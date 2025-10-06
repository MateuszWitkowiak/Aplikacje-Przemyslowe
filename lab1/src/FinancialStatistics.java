import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FinancialStatistics {
    private List<Employee> employees;
    public FinancialStatistics(List<Employee> employeeList) {
        this.employees = employeeList;
    }
    public Double getAverageSalary() {
        return employees.isEmpty() ? 0.0 : employees.stream().mapToInt(Employee::getSalary).average().orElse(0.0);
    }

    public Optional<Employee> getHighestPaidEmployee() {
        return employees.stream().max(Comparator.comparing(Employee::getSalary));
    }

    @Override
    public String toString() {
        return String.format("Highest paid Employee: %s Average Salary: %s", getHighestPaidEmployee(), getAverageSalary());
    }
}
