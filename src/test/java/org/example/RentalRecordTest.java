package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RentalRecordTest {

    @Test
    public void testTotalPriceCalculation() {
        VehicleAbstract vehicle = new EconomyCar("Toyota", "Corolla", "34ABC123", true); // daily: 60
        RentalRecord record = new RentalRecord(vehicle, "Ali Veli", 3); // 3 x 60 = 180

        String output = record.toString();
        assertTrue(output.contains("Total price: $180.0"));
    }

    @Test
    public void testToStringFormat() {
        VehicleAbstract vehicle = new LuxuryCar("BMW", "5 Series", "06XYZ456", false, false); // daily: 100
        RentalRecord record = new RentalRecord(vehicle, "Ayşe Fatma", 2); // 2 x 100 = 200

        String output = record.toString();

        assertTrue(output.contains("Ayşe Fatma rented"));
        assertTrue(output.contains("for 2 days"));
        assertTrue(output.contains("Total price: $200.0"));
    }
}
