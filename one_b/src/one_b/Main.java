package one_b;

public class Main {
    public static void main(String[] args) {
        // User session
        UserSession userSession = UserSession.getInstance();

        // Banking operations
        BankingOperations banking = new BankingOperations();

        // Attempting operations without logging in
        banking.viewBalance();
        banking.deposit(200);
        banking.withdraw(100);

        // Logging in
        userSession.login("JohnDoe");

        // Performing operations after logging in
        banking.viewBalance();
        banking.deposit(200);
        banking.withdraw(100);

        // Logging out
        userSession.logout();

        // Attempting operations after logging out
        banking.viewBalance();
        banking.deposit(200);
        banking.withdraw(100);
    }
}
