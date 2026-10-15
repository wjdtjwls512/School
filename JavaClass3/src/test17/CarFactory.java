package test17;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    public static CarFactory getInstance() {
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
