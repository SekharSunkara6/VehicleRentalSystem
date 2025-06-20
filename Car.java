public class Car extends Vehicle implements Rentable {
    private boolean rented = false;

    public Car(int vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Cars have a flat rate per day
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
