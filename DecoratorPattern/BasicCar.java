package DecoratorPattern;

class BasicCar implements VehicleFeature {
    @Override
    public String description() {
        return "Basic Car";
    }
}
