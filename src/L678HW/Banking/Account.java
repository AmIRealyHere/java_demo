package L678HW.Banking;
import java.util.ArrayList;
class Account {
    private int accountId;
    private Client owner;
    protected double balance;
    private static int nextAccountId = 1;
    private ArrayList<Transaction> transactions;

    public Account(Client owner) {
        this.owner = owner;
        this.accountId = nextAccountId++;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }
    public int getAccountId() {
        return accountId;
    }

    public Client getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(transactions.size() + 1, 0, accountId, amount));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(transactions.size() + 1, accountId, 0, amount));
        }
    }
}
