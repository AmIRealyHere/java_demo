package L5HWJava;
import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;

        while (true) {
            System.out.print("Enter the price of the item (or 0 to finish): $");
            double price = scanner.nextDouble();

            if (price == 0) {
                break;
            }

            totalPrice += price;
        }

        double discountAmount;
        String message;

        if (totalPrice > 1000 && totalPrice <= 10000) {
            discountAmount = totalPrice * 0.10;
            message = "Congratulations! You've saved $" + discountAmount;
        } else if (totalPrice > 10000) {
            discountAmount = totalPrice * 0.20;
            message = "Congratulations! You've saved $" + discountAmount;

        } else {
            double amountNeeded = 1000 - totalPrice;
            message = "Spend $" + amountNeeded + " more to get the discount. Do you want to continue?";
            char choice;
            do {
                System.out.print(message + " (Y/N): ");
                choice = scanner.next().charAt(0);
            } while (Character.toUpperCase(choice) != 'Y' && Character.toUpperCase(choice) != 'N');

            if (Character.toUpperCase(choice) == 'Y') {
                while (true) {
                    System.out.print("Enter the price of the item (or 0 to finish): $");
                    double price = scanner.nextDouble();

                    if (price == 0) {
                        break;
                    }

                    totalPrice += price;
                }

                if (totalPrice > 1000) {
                    discountAmount = totalPrice * 0.10;
                    message = "Congratulations! You've saved $" + discountAmount;
                } else {
                    message = "Spend $" + (1000 - totalPrice) + " more to get the discount.";
                }
            } else {
                message = "Thank you for shopping with us!";
            }
        }

        System.out.println(message);
        scanner.close();
    }
}
