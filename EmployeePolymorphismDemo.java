class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    Manager(String name, int id) {
        super(name, id);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    @Override
    void work() {
        System.out.println(name + " is writing code.");
    }
}

class Tester extends Employee {
    Tester(String name, int id) {
        super(name, id);
    }

    @Override
    void work() {
        System.out.println(name + " is testing the application.");
    }
}

public class EmployeePolymorphismDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Aman", 101);
        employees[1] = new Developer("Ravi", 102);
        employees[2] = new Tester("Neha", 103);

        for (Employee employee : employees) {
            employee.work();
        }
    }
}