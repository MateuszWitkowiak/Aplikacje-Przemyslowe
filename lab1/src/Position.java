public enum Position {
    PREZES(25000, 1),
    WICEPREZES(18000, 2),
    MANAGER(12000, 3),
    PROGRAMISTA(8000, 4),
    STAZYSTA(3000, 5);

    private final int salary;
    private final int hierarchy;

    Position(int salary, int hierarchy) {
        this.salary = salary;
        this.hierarchy = hierarchy;
    }

    public int getSalary() {
        return salary;
    }

    public int getHierarchy() {
        return hierarchy;
    }
}
