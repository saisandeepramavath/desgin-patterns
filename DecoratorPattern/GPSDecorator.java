package DecoratorPattern;

class GPSDecorator implements VehicleFeature {
    private VehicleFeature vehicleFeature;

    public GPSDecorator(VehicleFeature vehicleFeature) {
        this.vehicleFeature = vehicleFeature;
    }

    @Override
    public String description() {
        return vehicleFeature.description() + " with GPS";
    }
}
