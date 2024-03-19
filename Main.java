import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = {
            new Employee("Иван", 30, 50000),
            new Employee("Мария", 25, 60000),
            new Employee("Алексей", 35, 45000)
        };

        // Вызываем метод для сортировки и вывода информации о сотрудниках
        sortAndPrintEmployees(employees);
    }

    // Метод для сортировки и вывода информации о сотрудниках
    public static void sortAndPrintEmployees(Employee[] employees) {
        // Сортировка сотрудников по возрасту с использованием Comparable
        System.out.println("Сортировка сотрудников по возрасту:");
        Arrays.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Возраст: " + emp.getAge() + ", Зарплата: " + emp.getSalary());
        }

        // Сортировка сотрудников по зарплате с использованием Comparator
        System.out.println("\nСортировка сотрудников по зарплате:");
        Arrays.sort(employees, new EmployeeSalaryComparator());
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Возраст: " + emp.getAge() + ", Зарплата: " + emp.getSalary());
        }
    }
}
