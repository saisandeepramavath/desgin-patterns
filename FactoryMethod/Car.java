package FactoryMethod;

class Car extends Vehicle {
    @Override
    String createVehicle() {
        return "Car Created";
    }
}
