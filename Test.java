public class Test {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Иван", 30, 50000),
            new Employee("Мария", 25, 60000),
            new Employee("Алексей", 35, 45000)
        };

        Main.sortAndPrintEmployees(employees);
    }
}
