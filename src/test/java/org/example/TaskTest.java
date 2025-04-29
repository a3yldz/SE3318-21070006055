package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testIsOverdue_WhenNotCompletedAndPastDueDate_ReturnsTrue() {
        Task task = new Task("Test Task", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }

    @Test
    public void testIsOverdue_WhenCompleted_ReturnsFalse() {
        Task task = new Task("Test Task", LocalDate.now().minusDays(1));
        task.markAsCompleted();
        assertFalse(task.isOverdue());
    }

    @Test
    public void testMarkAsCompleted_ChangesStatus() {
        Task task = new Task("Complete", LocalDate.now().plusDays(1));
        assertFalse(task.isCompleted());
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    public void testGetTitle_ReturnsCorrectTitle() {
        Task task = new Task("My Task", LocalDate.now());
        assertEquals("My Task", task.getTitle());
    }

    @Test
    public void testGetDueDate_ReturnsCorrectDate() {
        LocalDate dueDate = LocalDate.now();
        Task task = new Task("Another Task", dueDate);
        assertEquals(dueDate, task.getDueDate());
    }
}
