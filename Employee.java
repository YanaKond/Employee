public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Геттеры для полей класса

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Метод для сравнения сотрудников по возрасту
    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.age, otherEmployee.getAge());
    }
}
