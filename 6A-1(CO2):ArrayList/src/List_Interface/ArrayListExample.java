package List_Interface;
import java.util.*;

public class ArrayListExample {
    static ArrayList<String> tasks = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nTask Management System:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addTask(sc); break;
                case 2: updateTask(sc); break;
                case 3: removeTask(sc); break;
                case 4: displayTasks(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
    
    public static void addTask(Scanner sc) {
        System.out.print("Enter task description: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }
    
    public static void updateTask(Scanner sc) {
        System.out.print("Enter task index to update: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new description: ");
            String newTask = sc.nextLine();
            tasks.set(index, newTask);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    
    public static void removeTask(Scanner sc) {
        System.out.print("Enter task index to remove: ");
        int index = sc.nextInt();
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    
    public static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }
}
