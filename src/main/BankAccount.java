import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("DEPOSIT", amount, balance));
            System.out.printf("Thank you. $%.2f has been deposited to your account.%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("WITHDRAW", -amount, balance));
            System.out.printf("Thank you. $%.2f has been withdrawn.%n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void printStatement() {
        System.out.printf("%-20s | %-8s | %-8s%n", "Date", "Amount", "Balance");
        for (Transaction transaction : transactions) {
            System.out.printf("%-20s | %8.2f | %8.2f%n", transaction.getDate(), transaction.getAmount(), transaction.getBalance());
        }
    }

    public double getBalance() {
        return balance;
    }
}

