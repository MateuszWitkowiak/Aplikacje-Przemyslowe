public enum Position {
    PREZES(25000, 1, "Prezes"),
    WICEPREZES(18000, 2, "Wiceprezes"),
    MANAGER(12000, 3, "Menedżer"),
    PROGRAMISTA(8000, 4, "Programista"),
    STAZYSTA(3000, 5, "Stażysta");

    private final int salary;
    private final int hierarchy;
    private final String jobTitle;

    Position(int salary, int hierarchy, String jobTitle) {
        this.salary = salary;
        this.hierarchy = hierarchy;
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public int getHierarchy() {
        return hierarchy;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
