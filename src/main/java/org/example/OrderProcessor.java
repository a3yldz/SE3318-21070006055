package org.example;

import java.util.List;

import java.util.List;

public class OrderProcessor {
    public void processOrder(String orderId, List<String> items) {
        if (orderId == null || orderId.trim().isEmpty()) {
            System.out.println("Error: Order ID is missing.");
            return;
        }

        if (items == null || items.isEmpty()) {
            System.out.println("Error: No items to process.");
            return;
        }

        if (orderId.length() > 5) {
            System.out.println("Processing complex order: " + orderId);
        } else {
            System.out.println("Processing order: " + orderId);
        }

        for (String item : items) {
            if (item != null && !item.trim().isEmpty()) {
                System.out.println("Processing item: " + item);
            } else {
                System.out.println("Skipping invalid item");
            }
        }
    }
}
