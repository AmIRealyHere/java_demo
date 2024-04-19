package L678HW.SalaryCalculation;

public class SalaryDemo {
    public static void main(String[] args) {
        Employee manager = new Employee("John Lennon", 20.0, 500.0);
        Employee[] developers = {
                new Employee("Alice Pagani", 15.0),
                new Employee("Bob Marley", 15.0),
                new Employee("Charlie Munger", 15.0)
        };
        Employee[] qaEngineers = {
                new Employee("David Bowie", 18.0, 300.0),
                new Employee("Paul Jones", 18.0, 300.0)
        };

        int hoursWorked = 40;

        System.out.println("Manager Salary: " + manager.getName() + ": $" + manager.calculateSalary(hoursWorked));
        System.out.println("Developer Salaries:");
        for (Employee developer : developers) {
            System.out.println(developer.getName() + ": $" + developer.calculateSalary(hoursWorked));
        }
        System.out.println("QA Engineer Salaries:");
        for (Employee qaEngineer : qaEngineers) {
            System.out.println(qaEngineer.getName() + ": $" + qaEngineer.calculateSalary(hoursWorked));
        }
    }
}