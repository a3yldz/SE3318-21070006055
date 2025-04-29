package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    /**
     * @requires task != null
     * @effects adds a task to the user's task list
     */
    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        }
    }

    /**
     * @requires taskTitle != null
     * @effects returns true if the user has a task with the given title
     */
    public boolean hasTask(String taskTitle) {
        if (taskTitle == null) return false;
        for (Task task : tasks) {
            if (task.getTitle().equals(taskTitle)) {
                return true;
            }
        }
        return false;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
