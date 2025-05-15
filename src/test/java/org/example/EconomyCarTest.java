package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EconomyCarTest {

    @Test
    public void testGetDailyPriceForHybridCar() {
        EconomyCar hybridCar = new EconomyCar("Toyota", "Prius", "34ABC123", true);
        // 50 + 10 = 60
        assertEquals(60.0, hybridCar.getDailyPrice(), 0.01);
    }

    @Test
    public void testGetDailyPriceForNonHybridCar() {
        EconomyCar regularCar = new EconomyCar("Renault", "Clio", "35XYZ789", false);
        // 50 + 0 = 50
        assertEquals(50.0, regularCar.getDailyPrice(), 0.01);
    }

    @Test
    public void testIsHybridTrue() {
        EconomyCar car = new EconomyCar("Hyundai", "Ioniq", "06HBY123", true);
        assertTrue(car.isHybrid());
    }

    @Test
    public void testIsHybridFalse() {
        EconomyCar car = new EconomyCar("Fiat", "Egea", "16BUR456", false);
        assertFalse(car.isHybrid());
    }
}
