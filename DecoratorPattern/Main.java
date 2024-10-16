package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFeature basicCar = new BasicCar();
        System.out.println(basicCar.description());

        VehicleFeature carWithGPS = new GPSDecorator(basicCar);
        System.out.println(carWithGPS.description());

        VehicleFeature carWithGPSAndSunroof = new SunroofDecorator(carWithGPS);
        System.out.println(carWithGPSAndSunroof.description());

        VehicleFeature fullyLoadedCar = new AirConditioningDecorator(carWithGPSAndSunroof);
        System.out.println(fullyLoadedCar.description());
    }
}
