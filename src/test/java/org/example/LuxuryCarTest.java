package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LuxuryCarTest {

    @Test
    public void testGetDailyPriceWithAllExtras() {
        LuxuryCar car = new LuxuryCar("BMW", "7 Series", "34LUX007", true, true);
        // 100 + 20 + 30 = 150
        assertEquals(150.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testGetDailyPriceWithNoExtras() {
        LuxuryCar car = new LuxuryCar("Mercedes", "E-Class", "35MRC345", false, false);
        // 100
        assertEquals(100.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testGetDailyPriceWithOnlyGps() {
        LuxuryCar car = new LuxuryCar("Audi", "A8", "06AUD111", true, false);
        // 100 + 20 = 120
        assertEquals(120.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testGetDailyPriceWithOnlyLeather() {
        LuxuryCar car = new LuxuryCar("Volvo", "S90", "16VOL909", false, true);
        // 100 + 30 = 130
        assertEquals(130.0, car.getDailyPrice(), 0.01);
    }

    @Test
    public void testHasGpsAndLeather() {
        LuxuryCar car = new LuxuryCar("Lexus", "LS", "01LXS999", true, true);
        assertTrue(car.hasGps());
        assertTrue(car.hasLeather());
    }

    @Test
    public void testHasNoGpsNorLeather() {
        LuxuryCar car = new LuxuryCar("Jaguar", "XJ", "07JGR007", false, false);
        assertFalse(car.hasGps());
        assertFalse(car.hasLeather());
    }
}
