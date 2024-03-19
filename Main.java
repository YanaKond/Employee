import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Иван", 30, 50000),
            new Employee("Мария", 25, 60000),
            new Employee("Алексей", 35, 45000)
        };
        sortAndPrintEmployees(employees);
    }

    public static void sortAndPrintEmployees(Employee[] employees) {
        System.out.println("Сортировка сотрудников по возрасту:");
        Arrays.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Возраст: " + emp.getAge() + ", Зарплата: " + emp.getSalary());
        }

        System.out.println("\nСортировка сотрудников по зарплате:");
        Arrays.sort(employees, new Salary());
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Возраст: " + emp.getAge() + ", Зарплата: " + emp.getSalary());
        }
    }
}
