package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testAddTask_TaskAddedSuccessfully() {
        User user = new User("Ceyda", "ceyda123@example.com");
        Task task = new Task("New Task", LocalDate.now().plusDays(1));
        user.addTask(task);
        assertTrue(user.getTasks().contains(task));
    }

    @Test
    public void testHasTask_TaskExists_ReturnsTrue() {
        User user = new User("Bora", "bora123@example.com");
        Task task = new Task("Task 1", LocalDate.now());
        user.addTask(task);
        assertTrue(user.hasTask("Task 1"));
    }

    @Test
    public void testHasTask_TaskDoesNotExist_ReturnsFalse() {
        User user = new User("Dicle", "minibobhaha123@example.com");
        assertFalse(user.hasTask("Nonexistent Task"));
    }

    @Test
    public void testGetTasks_InitiallyEmpty() {
        User user = new User("damla", "damla123@example.com");
        List<Task> tasks = user.getTasks();
        assertTrue(tasks.isEmpty());
    }

    @Test
    public void testGetUsernameAndEmail() {
        User user = new User("kemal", "kemal123@example.com");
        assertEquals("susan", user.getUsername());
        assertEquals("susan@example.com", user.getEmail());
    }
}
