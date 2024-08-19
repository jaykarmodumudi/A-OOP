package customersupportticketsys;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    private Queue<Ticket> ticketQueue;

    public CustomerSupportSystem() {
        ticketQueue = new LinkedList<>();
    }

    // Add a new ticket to the queue
    public void addTicket(String description) {
        Ticket newTicket = new Ticket(description);
        ticketQueue.add(newTicket);
        System.out.println("Added: " + newTicket);
    }

    // Process the next ticket in the queue
    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets to process.");
        } else {
            Ticket processedTicket = ticketQueue.poll();
            System.out.println("Processed: " + processedTicket);
        }
    }

    // Display all pending tickets in the queue
    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending Tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }

    // Main method to run the Customer Support Ticket System
    public static void main(String[] args) {
        CustomerSupportSystem supportSystem = new CustomerSupportSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Simple menu-driven interface
        do {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String description = scanner.nextLine();
                    supportSystem.addTicket(description);
                    break;
                case 2:
                    supportSystem.processNextTicket();
                    break;
                case 3:
                    supportSystem.displayPendingTickets();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
