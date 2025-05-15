package org.example;

/**
 * Represents a rental record for a vehicle.
 * Contains information about the vehicle, renter, rental duration, and total price.
 */
public class RentalRecord {

    /**
     * The rented vehicle.
     */
    private final VehicleAbstract vehicle;

    /**
     * The name of the person renting the vehicle.
     */
    private final String renterName;

    /**
     * The number of days the vehicle is rented.
     */
    private final int rentalDays;

    /**
     * The total rental price.
     */
    private final double totalPrice;

    /**
     * Constructs a new RentalRecord.
     *
     * @param vehicle     the rented vehicle
     * @param renterName  the name of the renter
     * @param rentalDays  the number of rental days
     */
    public RentalRecord(VehicleAbstract vehicle, String renterName, int rentalDays) {
        this.vehicle = vehicle;
        this.renterName = renterName;
        this.rentalDays = rentalDays;
        this.totalPrice = calculateTotalPrice();
    }

    /**
     * Calculates the total rental price based on the daily price and rental days.
     *
     * @return the total rental price
     */
    private double calculateTotalPrice() {
        return vehicle.getDailyPrice() * rentalDays;
    }

    /**
     * Returns a string representation of the rental record.
     *
     * @return a formatted string with rental details
     */
    @Override
    public String toString() {
        return renterName + " rented " + vehicle + " for " + rentalDays
                + " days. Total price: $" + totalPrice;
    }
}
