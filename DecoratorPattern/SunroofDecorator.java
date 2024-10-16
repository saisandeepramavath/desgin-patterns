package DecoratorPattern;

class SunroofDecorator implements VehicleFeature {
    private VehicleFeature vehicleFeature;

    public SunroofDecorator(VehicleFeature vehicleFeature) {
        this.vehicleFeature = vehicleFeature;
    }

    @Override
    public String description() {
        return vehicleFeature.description() + " with Sunroof";
    }
}
