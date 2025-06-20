import java.util.*;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();
    private Map<Integer, Vehicle> rentedVehicles = new HashMap<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean rentVehicle(int vehicleID, int days) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleID() == vehicleID && v instanceof Rentable) {
                Rentable rentable = (Rentable) v;
                if (!rentable.isRented()) {
                    rentable.rentVehicle();
                    rentedVehicles.put(vehicleID, v);
                    System.out.println(v.getModelName() + " rented for " + days + " days. Total cost: "
                            + v.calculateRentalCost(days));
                    return true;
                } else {
                    System.out.println(v.getModelName() + " is already rented.");
                    return false;
                }
            }
        }
        System.out.println("Vehicle ID not found.");
        return false;
    }

    public boolean returnVehicle(int vehicleID) {
        Vehicle v = rentedVehicles.get(vehicleID);
        if (v != null && v instanceof Rentable) {
            Rentable rentable = (Rentable) v;
            rentable.returnVehicle();
            rentedVehicles.remove(vehicleID);
            System.out.println(v.getModelName() + " returned successfully.");
            return true;
        }
        System.out.println("Vehicle not found or not rented.");
        return false;
    }

    public void showAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle v : vehicles) {
            if (v instanceof Rentable && !((Rentable) v).isRented()) {
                System.out.println(
                        "ID: " + v.getVehicleID() + " | Model: " + v.getModelName() + " | Rate: " + v.getRentalRate());
            }
        }
    }
}
