package test17;

public class Car {
    public static int carNum = 10001;

    private int carNumber;

    public Car() {
        this.carNumber = carNum;
        carNum++;
    }

    public int getCarNum() {
        return carNumber;
    }
}
