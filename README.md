# Task: Vehicle Rental System Design
Objective: To design and implement a vehicle rental system using abstract classes and interfaces to manage different types of vehicles (Cars, Bikes, Trucks) and calculate rental costs accordingly.


# Instructions:
- Create an Vehicle abstract class with properties like vehicleID, modelName, and rentalRate. Implement an abstract method calculateRentalCost(int days).
- Create concrete classes Car, Bike, and Truck that inherit from the Vehicle class. Each class should implement the calculateRentalCost method differently based on their rental   rates (e.g., Car may have a higher rate per day than Bike).
- Create an interface Rentable with methods like rentVehicle() and returnVehicle(). Implement this interface in each vehicle class.
- Implement a RentalService class that manages the rental process. This class should have methods to add vehicles, rent vehicles, and return vehicles. Use appropriate data        structures (e.g., List, Map) to store and manage vehicles.

# Expected Outcome:
A fully functional vehicle rental system that demonstrates the use of abstract classes, inheritance, and interfaces. The system should be able to handle different types of vehicles and calculate rental costs accurately.

# How to Run This Project
# Prerequisites
- Java JDK 8 or higher installed on your system
- (Optional) VS Code or any Java IDE

# Steps to Run from the Command Line
1. Clone the Repository
git clone https://github.com/SekharSunkara6/VehicleRentalSystem.git
cd VehicleRentalSystem

 
