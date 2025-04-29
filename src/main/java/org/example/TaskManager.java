package org.example;
import java.util.List;
public class TaskManager {
    private NotificationService notificationService;

    public TaskManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * @requires user != null && task != null
     * @effects assigns a task to a user and sends a notification
     */
    public void assignTask(User user, Task task) {
        if (user != null && task != null) {
            user.addTask(task);
            notificationService.sendNotification(user, "New task assigned: " + task.getTitle());
        }
    }

    /**
     * @requires user != null && taskTitle != null
     * @effects removes the task with the given title from the user
     */
    public void removeTask(User user, String taskTitle) {
        if (user != null && taskTitle != null) {
            List<Task> tasks = user.getTasks();
            tasks.removeIf(task -> task.getTitle().equals(taskTitle));
        }
    }

    /**
     * @requires user != null
     * @effects returns list of user's tasks
     */
    public List<Task> listTasks(User user) {
        if (user != null) {
            return user.getTasks();
        }
        return null;
    }
}
