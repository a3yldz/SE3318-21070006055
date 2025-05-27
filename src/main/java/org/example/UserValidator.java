package org.example;

public class UserValidator {
    public boolean validateUser(String name, int age, String email) {
        boolean isValid = true;

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name is missing.");
            isValid = false;
        } else if (name.length() < 2) {
            System.out.println("Error: Name is too short.");
            isValid = false;
        }

        if (age < 0 || age > 150) {
            System.out.println("Error: Age is out of realistic range.");
            isValid = false;
        }

        if (email == null || !email.contains("@") || email.startsWith("@") || email.endsWith("@")) {
            System.out.println("Error: Invalid email format.");
            isValid = false;
        }

        return isValid;
    }
}
