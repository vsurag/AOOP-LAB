package scheduler;

public class TaskExecutor {
    
    // Nested Logger class to handle task logs
    private class Logger {
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    // Method to execute a task
    public void execute(Task task) {
        Logger logger = new Logger();
        logger.log("Task started");
        
        task.perform(); // Perform the task
        
        logger.log("Task completed");
    }
}
