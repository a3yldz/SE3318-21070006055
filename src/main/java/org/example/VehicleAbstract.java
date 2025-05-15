package org.example;

/**
 * Abstract class representing a generic vehicle.
 * Provides base attributes such as brand, model, license plate, and base price.
 */
public abstract class VehicleAbstract {

    /**
     * The brand of the vehicle.
     */
    protected String brand;

    /**
     * The model of the vehicle.
     */
    protected String model;

    /**
     * The license plate of the vehicle.
     */
    protected String licensePlate;

    /**
     * The base rental price of the vehicle per day.
     */
    protected double basePrice;

    /**
     * Constructs a generic vehicle with the given parameters.
     *
     * @param brand        the brand of the vehicle
     * @param model        the model of the vehicle
     * @param licensePlate the license plate of the vehicle
     * @param basePrice    the base daily rental price
     */
    public VehicleAbstract(String brand, String model, String licensePlate, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.basePrice = basePrice;
    }

    /**
     * Calculates the daily rental price for the vehicle.
     *
     * @return the total daily price including additional features
     */
    public abstract double getDailyPrice();

    /**
     * Returns a string representation of the vehicle.
     *
     * @return a formatted string containing brand, model, and license plate
     */
    @Override
    public String toString() {
        return brand + " " + model + " (" + licensePlate + ")";
    }
}
