package taskmanagementsystem;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task added: " + description);
    }

    public void updateTask(int position, String newDescription) {
        if (position >= 0 && position < tasks.size()) {
            Task task = tasks.get(position);
            task.setDescription(newDescription);
            System.out.println("Task updated at position " + position + ": " + newDescription);
        } else {
            System.out.println("Invalid position");
        }
    }

    public void removeTask(int position) {
        if (position >= 0 && position < tasks.size()) {
            Task removedTask = tasks.remove(position);
            System.out.println("Task removed at position " + position + ": " + removedTask);
        } else {
            System.out.println("Invalid position");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i
