class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    Employee(String n, int i) {
        name = n;
        id = i;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Program17_EmployeeCount {
    public static void main(String[] args) {

        new Employee("Rahul", 101);
        new Employee("Amit", 102);
        new Employee("Neha", 103);

        Employee.displayCount();
    }
}