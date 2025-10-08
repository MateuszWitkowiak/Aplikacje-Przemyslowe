import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Mateusz", "Witkowiak", "mateusz@gmail.com", "FirmaJakas", Position.MANAGER),
                new Employee("Anna", "Nowak", "anna.nowak@firma1.pl", "Firma1", Position.PREZES),
                new Employee("Jan", "Kowalski", "jan.kowalski@firma1.pl", "Firma1", Position.WICEPREZES),
                new Employee("Kasia", "Zielińska", "kasia.zielinska@firma2.pl", "Firma2", Position.MANAGER),
                new Employee("Piotr", "Wiśniewski", "piotr.wisniewski@firma2.pl", "Firma2", Position.PROGRAMISTA),
                new Employee("Magda", "Lewandowska", "magda.lewandowska@firma2.pl", "Firma2", Position.STAZYSTA),
                new Employee("Tomasz", "Wójcik", "tomasz.wojcik@firma3.pl", "Firma3", Position.PREZES),
                new Employee("Karolina", "Kaczmarek", "karolina.kaczmarek@firma3.pl", "Firma3", Position.WICEPREZES),
                new Employee("Marek", "Mazur", "marek.mazur@firma3.pl", "Firma3", Position.MANAGER),
                new Employee("Jakub", "Jankowski", "jakub.jankowski@firma4.pl", "Firma4", Position.PROGRAMISTA),
                new Employee("Paweł", "Baran", "pawel.baran@firma4.pl", "Firma4", Position.STAZYSTA),
                new Employee("Ewa", "Dąbrowska", "ewa.dabrowska@firma4.pl", "Firma4", Position.PROGRAMISTA),
                new Employee("Ola", "Szymańska", "ola.szymanska@firma5.pl", "Firma5", Position.STAZYSTA),
                new Employee("Adam", "Król", "adam.krol@firma5.pl", "Firma5", Position.PROGRAMISTA),
                new Employee("Natalia", "Wróbel", "natalia.wrobel@firma5.pl", "Firma5", Position.MANAGER)
        );

        System.out.println("\n==== Testy funkcji enuma Position ====");
        for (Position p : Position.values()) {
            System.out.printf("Stanowisko: %-12s | salary: %5d | hierarchy: %d\n", p.name(), p.getSalary(), p.getHierarchy());
        }

        System.out.println("\n==== Test Employee ====");
        Employee employee = new Employee("Mateusz", "Witkowiak", "mateusz@gmail.com", "FirmaJakas", Position.MANAGER);
        System.out.println(employee);

        System.out.println("\n==== Test danych finansowych ====");
        FinancialStatistics financialStatistics = new FinancialStatistics(employees);
        System.out.println(financialStatistics);

        System.out.println("\n==== Testy operacji analitycznych ====");
        AnalyticOperations analyticOperations = new AnalyticOperations(employees);
        System.out.println(analyticOperations);

        System.out.println("\n==== Test klasy Company ====");
        Company company = new Company("NowaFirma");
        company.addEmployee("Mateusz", "Witkowiak", "mateusz@gmail.com", Position.PREZES);
        System.out.println(company);
        System.out.println("Lista pracowników po dodaniu pracownika:" + company.getEmployees());
        System.out.println("Tu poleci walidacja na to że w firmie już jest pracownik o takim mailu:");
        company.addEmployee("Mateusz", "Witkowiak", "mateusz@gmail.com", Position.PREZES);
    }
}