package org.example;

import java.util.ArrayList;
import java.util.List;
public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project() {
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    /**
     * @requires user != null
     * @effects adds the user to the project
     */
    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    /**
     * @requires task != null
     * @effects adds the task to the project
     */
    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        }
    }

    /**
     * @requires title != null
     * @effects returns the task with the given title if found, otherwise null
     */
    public Task getTaskByTitle(String title) {
        if (title == null) return null;
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
