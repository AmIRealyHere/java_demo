package L678HW.Banking;

public class Banking {
    public static void main(String[] args) {
        Client client1 = new Client("Wasea Pupkin", 1);
        Client client2 = new Client("Wasilisa Pumpkin", 2);

        CurrentAccount currentAccount = new CurrentAccount(client1, 500);
        SavingsAccount savingsAccount = new SavingsAccount(client2, 2.5);

        currentAccount.deposit(1000);
        currentAccount.withdraw(300);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(500);

        savingsAccount.addInterest();

        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}