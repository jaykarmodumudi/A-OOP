package listapplication;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private ArrayList<Task> tasks;

    public ToDoListApp() {
        tasks = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Added: " + description);
    }

    // Update a task's description
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setDescription(newDescription);
            System.out.println("Updated task " + (index + 1) + " to: " + newDescription);
        } else {
            System.out.println("Invalid index. Task not found.");
        }
    }

    // Remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Removed: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid index. Task not found.");
        }
    }

    // Display all tasks in the list
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            int index = 1;
            for (Task task : tasks) {
                System.out.println(index + ". " + task);
                index++;
            }
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoList = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Simple menu-driven interface
        do {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    toDoList.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
