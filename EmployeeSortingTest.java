import java.util.Arrays;

public class EmployeeSortingTest {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = {
            new Employee("Иван", 30, 50000),
            new Employee("Мария", 25, 60000),
            new Employee("Алексей", 35, 45000)
        };

        // Вызываем метод для сортировки и вывода информации о сотрудниках
        Main.sortAndPrintEmployees(employees);
    }
}
