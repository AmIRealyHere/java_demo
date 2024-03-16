package L4HWJava;
import java.util.Scanner;
public class BankAccountDemo {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        BankAccount account1 = new BankAccount(12345, 1000.0);
        BankAccount account2 = new BankAccount(67890, 500.0);

        System.out.print("Enter the amount to deposit into account1: ");
        double depositAmount1 = scanner.nextDouble();
        account1.deposit(depositAmount1);

        System.out.print("Enter the amount to withdraw from account1: ");
        double withdrawAmount1 = scanner.nextDouble();
        account1.withdraw(withdrawAmount1);

        System.out.print("Enter the amount to deposit into account2: ");
        double depositAmount2 = scanner.nextDouble();
        account2.deposit(depositAmount2);

        System.out.print("Enter the amount to withdraw from account2: ");
        double withdrawAmount2 = scanner.nextDouble();
        account2.withdraw(withdrawAmount2);

        scanner.close();
    }
}


