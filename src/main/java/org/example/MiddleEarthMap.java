package org.example;

public class MiddleEarthMap {

    public void navigate(String location, boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break; // FIXED: Added 'break' to prevent fall-through

            case "Shire":
                System.out.println("Navigating to the Shire");
                break; //FIXED: Added 'break'; previously, execution would fall through to 'Gondor'

            case "Gondor":
                System.out.println("Navigating to Gondor");
                break; //FIXED: Added 'break'; previously, fall-through to default

            default:
                System.out.println("Unknown location");
                break; //FIXED: Added 'break' for consistency and completeness
        }

        switch (location) {
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break; //FIXED: Added 'break' to terminate case properly
        }

        if (isSecretPassage) {
            //FIXED: Previously this block was empty and caused an 'EmptyBlock' violation
            // Added at least one statement to satisfy Checkstyle rules
            System.out.println("Secret passage flag is true.");
        }

        //Using ternary just for output
        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
