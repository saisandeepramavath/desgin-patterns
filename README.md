# Vehicle Management System - Design Patterns Assignment

This project is a demonstration of two design patterns: **Factory Method** and **Decorator**. The project is divided into two separate modules:

1. **Factory Method Pattern (FactoryMethod)**
   - The Factory Method pattern is used to abstract the instantiation of vehicle types such as **Car**, **Truck**, and **Bike**.
   - This pattern helps in encapsulating the object creation logic, which allows for flexible extension of new vehicle types without modifying existing code.

   - **Classes Included**:
     - `Vehicle`: Abstract class representing a generic vehicle.
     - `Car`, `Truck`, `Bike`: Concrete implementations of the `Vehicle` class.
     - `VehicleFactory`: Factory class responsible for creating instances of different vehicle types.
     - `Main`: Driver class to demonstrate the creation of vehicles.

2. **Decorator Pattern (DecoratorPattern)**
   - The Decorator pattern is used to dynamically add features to a **Basic Car** such as **GPS**, **Sunroof**, and **Air Conditioning** without modifying the original class.
   - This pattern allows for extending the functionalities of an object in a flexible and reusable manner.

   - **Classes Included**:
     - `VehicleFeature`: Interface defining the common behavior of vehicles.
     - `BasicCar`: Basic implementation of the `VehicleFeature` interface.
     - `GPSDecorator`, `SunroofDecorator`, `AirConditioningDecorator`: Decorator classes for adding features to the basic car.
     - `Main`: Driver class to demonstrate adding features to a car dynamically.

## Project Structure
The project is divided into the following packages and files:

### FactoryMethod
- `Vehicle.java`: Abstract base class for different vehicles.
- `Car.java`, `Truck.java`, `Bike.java`: Concrete implementations of the vehicle.
- `VehicleFactory.java`: Factory class to create vehicle instances.
- `Main.java`: Driver class to demonstrate the Factory Method pattern.

### DecoratorPattern
- `VehicleFeature.java`: Interface defining vehicle features.
- `BasicCar.java`: Basic implementation of the vehicle feature.
- `GPSDecorator.java`, `SunroofDecorator.java`, `AirConditioningDecorator.java`: Decorator classes to add features.
- `Main.java`: Driver class to demonstrate the Decorator pattern.

## How to Run
1. Compile all the `.java` files in each package.
2. Run the `Main` class in each package to see the respective design patterns in action.

## Class Diagrams
- **Factory Method Pattern**: The `Vehicle` class is the base class, and the `Car`, `Truck`, `Bike` classes inherit from it. The `VehicleFactory` class is responsible for creating instances of these vehicles.
- **Decorator Pattern**: The `VehicleFeature` interface is implemented by the `BasicCar` class. The `GPSDecorator`, `SunroofDecorator`, and `AirConditioningDecorator` classes extend the features of `BasicCar` by adding additional functionalities.
