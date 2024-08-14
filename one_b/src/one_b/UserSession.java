package one_b;

public class UserSession {
    private static UserSession instance;
    private boolean loggedIn;
    private String username;

    // Private constructor to prevent instantiation
    private UserSession() {
        loggedIn = false;
    }

    // Method to get the single instance of UserSession
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to login
    public void login(String username) {
        this.username = username;
        this.loggedIn = true;
        System.out.println(username + " logged in.");
    }

    // Method to logout
    public void logout() {
        System.out.println(username + " logged out.");
        this.username = null;
        this.loggedIn = false;
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to get the username of the logged-in user
    public String getUsername() {
        return username;
    }
}
