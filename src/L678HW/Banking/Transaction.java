package L678HW.Banking;

public class Transaction {
    private int transactionId;
    private int fromAccountId;
    private int toAccountId;
    private double amount;

    public Transaction(int transactionId, int fromAccountId, int toAccountId, double amount) {
        this.transactionId = transactionId;
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getFromAccountId() {
        return fromAccountId;
    }
    public int getToAccountId() {
        return toAccountId;
    }

    public double getAmount() {
        return amount;
    }
}