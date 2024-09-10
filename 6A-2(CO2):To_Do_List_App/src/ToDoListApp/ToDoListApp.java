package ToDoListApp;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTo-Do List Application:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    private static void updateTask() {
        System.out.print("Enter the task index to update: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter the new task description: ");
            String newTask = scanner.nextLine();
            tasks.set(index, newTask);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void removeTask() {
        System.out.print("Enter the task index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void displayTasks() {
        System.out.println("\nTo-Do List:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
