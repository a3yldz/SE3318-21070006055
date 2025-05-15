package org.example;

/**
 * Represents a luxury car.
 * Adds extra charges per day if GPS or leather seats are available.
 */
public class LuxuryCar extends VehicleAbstract {

    /**
     * Indicates whether the car has a GPS.
     */
    private final boolean gps;

    /**
     * Indicates whether the car has leather seats.
     */
    private final boolean leather;

    /**
     * Base rental price for a luxury car.
     */
    private static final double BASE_PRICE = 100.0;

    /**
     * Additional daily cost if GPS is available.
     */
    private static final double GPS_EXTRA_COST = 20.0;

    /**
     * Additional daily cost if leather seats are available.
     */
    private static final double LEATHER_EXTRA_COST = 30.0;

    /**
     * Constructs a new LuxuryCar object.
     *
     * @param brand        the brand of the car
     * @param model        the model of the car
     * @param licensePlate the license plate of the car
     * @param gps          true if the car has GPS, false otherwise
     * @param leather      true if the car has leather seats, false otherwise
     */
    public LuxuryCar(String brand, String model, String licensePlate, boolean gps, boolean leather) {
        super(brand, model, licensePlate, BASE_PRICE);
        this.gps = gps;
        this.leather = leather;
    }

    /**
     * Calculates the daily rental price.
     * Adds extra cost for GPS and leather seats if available.
     *
     * @return the total daily rental price
     */
    @Override
    public double getDailyPrice() {
        double price = basePrice;
        if (gps) {
            price += GPS_EXTRA_COST;
        }
        if (leather) {
            price += LEATHER_EXTRA_COST;
        }
        return price;
    }

    /**
     * Returns whether the car has GPS.
     *
     * @return true if GPS is available, false otherwise
     */
    public boolean hasGps() {
        return gps;
    }

    /**
     * Returns whether the car has leather seats.
     *
     * @return true if leather seats are available, false otherwise
     */
    public boolean hasLeather() {
        return leather;
    }
}
