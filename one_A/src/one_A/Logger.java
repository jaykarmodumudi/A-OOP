package one_A;

public class Logger {
    // Static member holds only one instance of the Logger class
    private static Logger loggerInstance;
    
    // Private constructor prevents instantiation from other classes
    private Logger() {
        // Initialize logger
        System.out.println("Logger initialized.");
    }

    // Method to provide access to the singleton instance
    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    // Method to log information messages
    public void logInfo(String message) {
        System.out.println("[INFO]: " + message);
    }

    // Method to log debug messages
    public void logDebug(String message) {
        System.out.println("[DEBUG]: " + message);
    }

    // Method to log error messages
    public void logError(String message) {
        System.out.println("[ERROR]: " + message);
    }
}
