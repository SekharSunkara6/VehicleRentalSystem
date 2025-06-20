public class Main {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();

        // Add vehicles
        rentalService.addVehicle(new Car(1, "Honda Civic", 1000));
        rentalService.addVehicle(new Bike(2, "Yamaha FZ", 300));
        rentalService.addVehicle(new Truck(3, "Tata LPT", 2000));

        // Show available vehicles
        rentalService.showAvailableVehicles();

        // Rent a car for 5 days
        rentalService.rentVehicle(1, 5);

        // Try to rent the same car again
        rentalService.rentVehicle(1, 2);

        // Rent a bike for 4 days
        rentalService.rentVehicle(2, 4);

        // Show available vehicles again
        rentalService.showAvailableVehicles();

        // Return the car
        rentalService.returnVehicle(1);

        // Show available vehicles again
        rentalService.showAvailableVehicles();
    }
}
