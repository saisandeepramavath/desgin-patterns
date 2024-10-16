package FactoryMethod;

class Truck extends Vehicle {
    @Override
    String createVehicle() {
        return "Truck Created";
    }
}
