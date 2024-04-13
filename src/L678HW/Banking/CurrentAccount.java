package L678HW.Banking;

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Client owner, double overdraftLimit) {
        super(owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            getTransactions().add(new Transaction(getTransactions().size() + 1, getAccountId(), 0, amount));
        }
    }
}