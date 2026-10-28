package ioTest;

public class Car {
    private static int carCount = 0;

    private String model;
    private String color;
    private long price;

    public Car(String model, String color, long price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void showCar() {
        System.out.println("보유 차량 " + carCount++);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
