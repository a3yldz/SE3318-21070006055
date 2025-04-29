package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    @Test
    public void testAddUser_UserAddedSuccessfully() {
        Project project = new Project();
        User user = new User("Bora", "bora123@example.com");
        project.addUser(user);
        assertTrue(project.getUsers().contains(user));
    }

    @Test
    public void testAddTask_TaskAddedSuccessfully() {
        Project project = new Project();
        Task task = new Task("Project Task", LocalDate.now().plusDays(5));
        project.addTask(task);
        assertTrue(project.getTasks().contains(task));
    }

    @Test
    public void testGetTaskByTitle_TaskExists_ReturnsTask() {
        Project project = new Project();
        Task task = new Task("Important Task", LocalDate.now());
        project.addTask(task);
        Task foundTask = project.getTaskByTitle("Important Task");
        assertNotNull(foundTask);
        assertEquals("Important Task", foundTask.getTitle());
    }

    @Test
    public void testGetTaskByTitle_TaskDoesNotExist_ReturnsNull() {
        Project project = new Project();
        Task foundTask = project.getTaskByTitle("Nonexistent Task");
        assertNull(foundTask);
    }
}
