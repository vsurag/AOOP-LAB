package scheduler;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
    
    // List to hold scheduled tasks
    private List<Task> tasks;

    public TaskScheduler() {
        tasks = new ArrayList<>();
    }

    // Method to add tasks
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to run all tasks
    public void runTasks() {
        TaskExecutor executor = new TaskExecutor();
        for (Task task : tasks) {
            executor.execute(task);
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks using lambda expressions
        scheduler.addTask(() -> System.out.println("Task 1 is being executed"));
        scheduler.addTask(() -> System.out.println("Task 2 is being executed"));
        scheduler.addTask(() -> System.out.println("Task 3 is being executed"));

        // Run all scheduled tasks
        scheduler.runTasks();
    }
}
