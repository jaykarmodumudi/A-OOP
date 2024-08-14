package one_A;
public class Main {
    public static void main(String[] args) {
        // Get the single instance of the logger
        Logger logger = Logger.getInstance();

        // Log messages with different severity levels
        logger.logInfo("This is an info message.");
        logger.logDebug("This is a debug message.");
        logger.logError("This is an error message.");

        // Get the single instance of the logger again
        Logger anotherLogger = Logger.getInstance();

        // Log another set of messages to demonstrate that the same instance is used
        anotherLogger.logInfo("This is another info message.");
        anotherLogger.logDebug("This is another debug message.");
        anotherLogger.logError("This is another error message.");

        // Check if both instances are the same
        if (logger == anotherLogger) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}
