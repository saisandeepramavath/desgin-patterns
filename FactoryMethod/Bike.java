package FactoryMethod;

class Bike extends Vehicle {
    @Override
    String createVehicle() {
        return "Bike Created";
    }
}
