public class Truck extends Vehicle implements Rentable {
    private boolean rented = false;

    public Truck(int vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Trucks have a fixed surcharge per rental
        double surcharge = 50.0;
        return (rentalRate * days) + surcharge;
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
