public class Bike extends Vehicle implements Rentable {
    private boolean rented = false;

    public Bike(int vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Bikes get a 10% discount for rentals over 3 days
        if (days > 3) {
            return rentalRate * days * 0.9;
        }
        return rentalRate * days;
    }

    @Override
    public void rentVehicle() {
        rented = true;
    }

    @Override
    public void returnVehicle() {
        rented = false;
    }

    @Override
    public boolean isRented() {
        return rented;
    }
}
