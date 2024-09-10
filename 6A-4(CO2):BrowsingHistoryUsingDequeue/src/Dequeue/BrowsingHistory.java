package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistory {
    static Deque<String> history = new ArrayDeque<>();
    static String currentPage = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBrowsing History:");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: visitPage(sc); break;
                case 2: goBack(); break;
                case 3: goForward(); break;
                case 4: displayCurrentPage(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }

    public static void visitPage(Scanner sc) {
        if (!currentPage.isEmpty()) {
            history.push(currentPage);
        }
        System.out.print("Enter new page: ");
        currentPage = sc.nextLine();
        System.out.println("Visiting page: " + currentPage);
    }

    public static void goBack() {
        if (history.isEmpty()) {
            System.out.println("No previous page.");
        } else {
            currentPage = history.pop();
            System.out.println("Going back to: " + currentPage);
        }
    }

    public static void goForward() {
        System.out.println("Going forward feature is not available.");
    }

    public static void displayCurrentPage() {
        if (currentPage.isEmpty()) {
            System.out.println("No current page.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }
}
