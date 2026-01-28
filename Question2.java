class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

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

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new PartTimeEmployee(40, 500);

        System.out.println("Full-Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + emp2.calculateSalary());
    }
}
