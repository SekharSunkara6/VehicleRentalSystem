public abstract class Vehicle {
    protected int vehicleID;
    protected String modelName;
    protected double rentalRate;

    public Vehicle(int vehicleID, String modelName, double rentalRate) {
        this.vehicleID = vehicleID;
        this.modelName = modelName;
        this.rentalRate = rentalRate;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public String getModelName() {
        return modelName;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}
