public class employe {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.display();
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this(101, "Aman", 50000.0);
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}