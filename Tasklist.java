import java.util.ArrayList;
import java.util.List;

public class Tasklist {
    private List<Task> tasks;

    public Tasklist() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println(i + ". " + task.getDescription() + " [" + (task.isCompleted() ? "Completed" : "Pending") + "]");
        }
    }

    public void viewStatistics() {
        int totalTasks = tasks.size();
        long completedTasks = tasks.stream().filter(Task::isCompleted).count();
        System.out.println("Total tasks: " + totalTasks);
        System.out.println("Completed tasks: " + completedTasks);
        System.out.println("Completion percentage: " + (totalTasks == 0 ? 0 : (completedTasks * 100 / totalTasks)) + "%");
    }

    public void sortTasksByCompletionStatus() {
        tasks.sort((t1, t2) -> Boolean.compare(t1.isCompleted(), t2.isCompleted()));
    }
}
