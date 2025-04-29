package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotification_NotificationIsSaved() {
        NotificationService service = new NotificationService();
        User user = new User("testUser", "test@example.com");
        service.sendNotification(user, "New Task Assigned!");

        List<String> notifications = service.getNotifications(user);
        assertEquals(1, notifications.size());
        assertTrue(notifications.contains("New Task Assigned!"));
    }

    @Test
    public void testGetNotifications_NoNotifications_ReturnsEmptyList() {
        NotificationService service = new NotificationService();
        User user = new User("noNotifUser", "noNotif@example.com");

        List<String> notifications = service.getNotifications(user);
        assertNotNull(notifications);
        assertTrue(notifications.isEmpty());
    }
}
