package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        String vehicleType = "Car";
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        System.out.println(vehicle.createVehicle());

        vehicleType = "Truck";
        vehicle = VehicleFactory.getVehicle(vehicleType);
        System.out.println(vehicle.createVehicle());

        vehicleType = "Bike";
        vehicle = VehicleFactory.getVehicle(vehicleType);
        System.out.println(vehicle.createVehicle());
    }
}
