package org.example;

public class PaymentService {
    public boolean processPayment(String cardNumber, double amount, String currency) {
        if (cardNumber == null || cardNumber.length() < 16) {
            System.out.println("Error: Invalid card number.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Error: Amount must be positive.");
            return false;
        }

        if (currency == null || currency.isEmpty()) {
            System.out.println("Error: Currency not specified.");
            return false;
        }

        if (cardNumber.startsWith("4")) {
            if (currency.equals("USD")) {
                System.out.println("Processing Visa USD payment");
            } else {
                System.out.println("Processing Visa payment in other currency");
            }
        } else {
            System.out.println("Processing Non-Visa card payment");
        }

        return true;
    }
}
