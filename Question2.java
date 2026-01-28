// Superclass
class Employee {
    public double calculateSalary() {
        return 0.0; // default implementation
    }
}

// Subclass: Full-time employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass: Part-time employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class to demonstrate runtime polymorphism
public class Main {
    public static void main(String[] args) {

        // Superclass reference pointing to subclass objects
        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new PartTimeEmployee(40, 500);

        // Runtime polymorphism in action
        System.out.println("Full-Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + emp2.calculateSalary());
    }
}
