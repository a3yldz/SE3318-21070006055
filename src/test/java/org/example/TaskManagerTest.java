package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testAssignTask_TaskAssignedAndNotificationSent() {
        NotificationService notificationService = new NotificationService();
        TaskManager manager = new TaskManager(notificationService);
        User user = new User("managerUser", "manager@example.com");
        Task task = new Task("Managed Task", LocalDate.now().plusDays(2));

        manager.assignTask(user, task);

        assertTrue(user.getTasks().contains(task));
        assertEquals(1, notificationService.getNotifications(user).size());
        assertTrue(notificationService.getNotifications(user).get(0).contains("Managed Task"));
    }

    @Test
    public void testRemoveTask_TaskRemovedSuccessfully() {
        NotificationService notificationService = new NotificationService();
        TaskManager manager = new TaskManager(notificationService);
        User user = new User("removeUser", "remove@example.com");
        Task task = new Task("Task to Remove", LocalDate.now());
        user.addTask(task);

        manager.removeTask(user, "Task to Remove");

        assertFalse(user.hasTask("Task to Remove"));
    }

    @Test
    public void testListTasks_ReturnsCorrectTasks() {
        NotificationService notificationService = new NotificationService();
        TaskManager manager = new TaskManager(notificationService);
        User user = new User("listUser", "list@example.com");
        Task task1 = new Task("Task 1", LocalDate.now());
        Task task2 = new Task("Task 2", LocalDate.now());

        user.addTask(task1);
        user.addTask(task2);

        List<Task> tasks = manager.listTasks(user);

        assertEquals(2, tasks.size());
        assertTrue(tasks.contains(task1));
        assertTrue(tasks.contains(task2));
    }
}
