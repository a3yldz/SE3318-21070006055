package org.example;

/**
 * Main class for testing the car rental system.
 */
public class App {

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Creating a luxury car with GPS and leather seats
        VehicleAbstract car1 = new LuxuryCar("BMW", "X5", "34XYZ123", true, true);

        // Creating an economy car that is hybrid
        VehicleAbstract car2 = new EconomyCar("Toyota", "Yaris", "35ABC789", true);

        // Creating rental records
        RentalRecord record1 = new RentalRecord(car1, "Ali Veli", 3);
        RentalRecord record2 = new RentalRecord(car2, "Ayşe Fatma", 5);

        // Printing out rental details
        System.out.println(record1);
        System.out.println(record2);
    }
}
