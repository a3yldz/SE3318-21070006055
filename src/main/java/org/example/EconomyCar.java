package org.example;

/**
 * Represents an economy car.
 * The daily rental price changes depending on whether the car is hybrid.
 */
public class EconomyCar extends VehicleAbstract {

    /**
     * Indicates whether the car is a hybrid vehicle.
     */
    private final boolean hybrid;

    /**
     * Base rental price for an economy car.
     */
    private static final double BASE_PRICE = 50.0;

    /**
     * Additional daily cost if the car is hybrid.
     */
    private static final double HYBRID_EXTRA_COST = 10.0;

    /**
     * Constructs a new EconomyCar object.
     *
     * @param brand        the brand of the car
     * @param model        the model of the car
     * @param licensePlate the license plate of the car
     * @param hybrid       true if the car is hybrid, false otherwise
     */
    public EconomyCar(String brand, String model, String licensePlate, boolean hybrid) {
        super(brand, model, licensePlate, BASE_PRICE);
        this.hybrid = hybrid;
    }

    /**
     * Calculates the daily rental price.
     * Adds an extra charge if the car is hybrid.
     *
     * @return the total daily rental price
     */
    @Override
    public double getDailyPrice() {
        double price = basePrice;
        if (hybrid) {
            price += HYBRID_EXTRA_COST;
        }
        return price;
    }

    /**
     * Returns whether the car is hybrid.
     *
     * @return true if the car is hybrid, false otherwise
     */
    public boolean isHybrid() {
        return hybrid;
    }
}
