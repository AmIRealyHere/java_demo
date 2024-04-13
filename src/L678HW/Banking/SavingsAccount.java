package L678HW.Banking;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(Client owner, double interestRate) {
        super(owner);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        getTransactions().add(new Transaction(getTransactions().size() + 1, 0, getAccountId(), interest));
    }
}