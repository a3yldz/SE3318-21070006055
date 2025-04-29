package org.example;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = false;
    }

    /**
     * @requires none
     * @effects returns true if task is overdue and not completed
     */
    public boolean isOverdue() {
        return !completed && LocalDate.now().isAfter(dueDate);
    }

    /**
     * @requires none
     * @effects marks the task as completed
     */
    public void markAsCompleted() {
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }
}
