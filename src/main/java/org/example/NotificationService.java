package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<User, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    /**
     * @requires user != null && message != null
     * @effects sends a notification to the user
     */
    public void sendNotification(User user, String message) {
        if (user != null && message != null) {
            notifications.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
        }
    }

    /**
     * @requires user != null
     * @effects returns list of notifications for the user
     */
    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user, new ArrayList<>());
    }
}
