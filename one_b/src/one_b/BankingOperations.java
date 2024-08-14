package one_b;

public class BankingOperations {
    private double balance;

    public BankingOperations() {
        balance = 1000.0; // Starting balance
    }

    // Method to view balance
    public void viewBalance() {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            balance += amount;
            System.out.println("$" + amount + " deposited. New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
