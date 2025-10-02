public class Employee implements EmployeeInterface {
    private final String name;
    private final String surname;
    private final String emailAdress;
    private final Position position;
    private final String companyName;

    public Employee(String name, String surname, String emailAdress, String companyName, Position position) {
        this.name = name;
        this.surname = surname;
        this.emailAdress = emailAdress;
        this.companyName = companyName;
        this.position = position;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSurname() {
        return surname;
    }
    @Override
    public String getNameAndSurname() {
        return String.format("%s %s", name, surname);
    }
    @Override
    public String getEmailAdress() {
        return emailAdress;
    }
    @Override
    public String getCompanyName() {
        return companyName;
    }
    @Override
    public Number getSalary() {
        return position.getSalary();
    }
    @Override
    public String getPositionInCompany() {
        return position.getJobTitle();
    }
    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s Pozycja w firmie: %s", getName(), getSurname(), getPositionInCompany());
    }
}
