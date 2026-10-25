package ioTest;

import java.util.Scanner;

public class CarStore {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("차종/색상/가격을 순서대로 입력해주세요.");
            cars[i] = new Car(sc.nextLine(), sc.nextLine(), sc.nextLong());
            sc.nextLine();
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].showCar();
        }
    }
}
