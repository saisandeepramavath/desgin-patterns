package DecoratorPattern;

class AirConditioningDecorator implements VehicleFeature {
    private VehicleFeature vehicleFeature;

    public AirConditioningDecorator(VehicleFeature vehicleFeature) {
        this.vehicleFeature = vehicleFeature;
    }

    @Override
    public String description() {
        return vehicleFeature.description() + " with Air Conditioning";
    }
}
