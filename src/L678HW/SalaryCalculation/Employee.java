package L678HW.SalaryCalculation;

public class Employee {
    private String name;
    private double hourlyRate;
    private double bonus;

    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.bonus = 0.0; // No bonus by default
    }

    public Employee(String name, double hourlyRate, double bonus) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
    }
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate + bonus;
    }

    public String getName() {
        return name;
    }
}