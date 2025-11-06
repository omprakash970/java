package OOP.Problems_on_oop;

class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getsalary() + bonus;
    }

}

public class problem5 {
    public static void main(String[] args) {
        Manager manager = new Manager(50000, 10000);
        System.out.println("Total Salary of Manager: " + manager.getTotalSalary());
    }

}
