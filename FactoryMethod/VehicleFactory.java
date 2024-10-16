package FactoryMethod;

class VehicleFactory {
    static Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return new Car();
            case "Truck":
                return new Truck();
            case "Bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unknown Vehicle Type");
        }
    }
}
