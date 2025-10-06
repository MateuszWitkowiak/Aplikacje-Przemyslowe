public class Main {
    public static void main(String[] args) {
        System.out.println("Testy funkcji enuma Position:");
        for (Position p : Position.values()) {
            System.out.printf(
                    "Stanowisko: %s | salary: %5d | hierarchy: %d",
                    p.name(), p.getSalary(), p.getHierarchy()
            );
        }

    }

}