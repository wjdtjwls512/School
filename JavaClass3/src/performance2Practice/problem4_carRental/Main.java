package performance2Practice.problem4_carRental;

import java.util.ArrayList;
import java.util.Scanner;

// 문제 4: 차량 렌트
class Car {
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;
    private static int serialNum = 101;

    public Car(String carNumber, String carType, int dailyPrice) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        num = serialNum;
        rented = false;
    }

    public int rent(int days) {
        rented = true;
        return days * dailyPrice;
    }

    public void showInfo() {
        System.out.println("관리번호: " + num);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice);
        System.out.println("대여 상태: " + rented);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        int choice = sc.nextInt();
        int days = sc.nextInt();
        int total = 0;

        if (choice > 3) {
            System.out.println("잘못된 입력입니다.");
        } else {
            Car car = cars.get(choice - 1);
            total = car.rent(days);
        }

        for (Car car : cars) {
            car.showInfo();
        }
        System.out.println("\n총 대여금액: " + total);
    }
}
