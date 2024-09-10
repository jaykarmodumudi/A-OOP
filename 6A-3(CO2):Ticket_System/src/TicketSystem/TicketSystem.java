package TicketSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TicketSystem {
    private Queue<String> ticketQueue;

    public TicketSystem() {
        // Using LinkedList to implement the Queue interface
        ticketQueue = new LinkedList<>();
    }

    // Add a new ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    // Process (remove) the next ticket in line
    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            String ticket = ticketQueue.poll();
            System.out.println("Processing ticket: " + ticket);
        }
    }

    // Display all pending tickets
    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            for (String ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }

    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCustomer Support Ticket System:");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the ticket description: ");
                    String ticket = scanner.nextLine();
                    system.addTicket(ticket);
                    break;
                case 2:
                    system.processNextTicket();
                    break;
                case 3:
                    system.displayPendingTickets();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
