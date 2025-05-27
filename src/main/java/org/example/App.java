package org.example;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        System.out.println("ORDER PROCESSING TEST-----------------");
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder("12345", Arrays.asList("item1", "item2", null));

        System.out.println("USER VALIDATION TEST-----------------");
        UserValidator validator = new UserValidator();
        boolean isUserValid = validator.validateUser("A", -5, null);
        System.out.println("User valid: " + isUserValid);

        System.out.println("PAYMENT PROCESSING TEST-----------------");
        PaymentService paymentService = new PaymentService();
        boolean paymentSuccess = paymentService.processPayment("", -250.00, "TL");
        System.out.println("Payment success: " + paymentSuccess);
    }
}
