package performance2.problem4_carRental;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * [차량 렌트]
 * 차량 세 대를 ArrayList에 등록한다. 차량 번호(1~3)와 대여 일수를 입력받아
 * 선택한 차량의 대여 비용을 계산하고 차량 정보와 총 대여 금액을 출력한다.
 * 차량 번호가 3보다 크거나 1보다 작으면 잘못된 입력으로 처리한다.
 */
// 차량의 관리 정보와 대여 상태를 보관하고 대여 금액을 계산한다.
class Car {
    // 이 차량을 구별하는 관리 번호를 저장한다. 첫 차량은 101번이다.
    private int num;
    // 차량 번호판 문자열을 저장한다.
    private String carNumber;
    // 차종 이름을 저장한다.
    private String carType;
    // 차량을 하루 빌리는 데 드는 요금을 저장한다.
    private int dailyPrice;
    // 차량이 대여된 상태인지 저장한다.
    private boolean rented;
    // 객체가 생성될 때마다 증가시켜 다음 번호를 발급하는 공용 값이다.
    private static int serialNum = 101;

    // 생성자: 관리번호를 자동 발급하고 차량 정보 및 미대여 상태를 저장한다.
    public Car(String carNumber, String carType, int dailyPrice) {
        // 현재 serialNum을 이 차량의 관리 번호로 사용한다.
        this.num = serialNum;
        // 다음 차량이 만들어지면 다음 번호를 받도록 공용 번호를 1 증가시킨다.
        serialNum++;
        // 생성자에 전달된 차량번호, 차종, 하루 요금을 각각 필드에 저장한다.
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        // 새로 등록된 차량은 아직 빌려간 사람이 없으므로 false로 시작한다.
        this.rented = false;
    }

    // 하루 요금에 대여 일수를 곱해 총액을 반환하고 대여 상태를 표시한다.
    public int rent(int days) {
        // rent()가 호출되면 이 차량을 대여한 것으로 표시한다.
        rented = true;
        // 총 요금은 하루 요금에 대여 일수를 곱한 값이다.
        return dailyPrice * days;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("관리번호: " + num);
        System.out.println("차량번호: " + carNumber);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice);
        System.out.println("대여 여부: " + rented);
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        // 문제에서 지정한 차량 세 대를 순서대로 목록에 등록한다.
        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        // 첫 번째 입력은 차량 선택 번호(1~3), 두 번째 입력은 대여 일수다.
        int choice = sc.nextInt();
        int days = sc.nextInt();
        int total = 0; // 선택한 차량의 대여 비용을 나중에 저장한다.

        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (choice < 1 || choice > 3) {
            System.out.println("잘못된 입력입니다");
        } else {
            // 사용자 번호는 1부터 시작하고 목록 위치는 0부터 시작하므로 1을 뺀다.
            Car car = cars.get(choice - 1);
            // rent()를 호출해 대여 상태를 바꾸고 총 대여 금액을 계산한다.
            total = car.rent(days);
        }

        // 선택 여부와 관계없이 세 차량의 현재 정보를 모두 출력한다.
        for (Car car : cars) {
            car.showInfo();
            System.out.println();
        }
        System.out.println("총 대여금액: " + total);
    }
}
