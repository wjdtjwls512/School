package testPractice.performance2.cinema;

import java.util.Scanner;

/*
 * [영화관 좌석 예약]
 * 어벤져스 상영관의 좌석은 10석이다. 홍길동과 김철수의 예약 수를 입력받아
 * 순서대로 예약한다. 잘못된 예약 수나 남은 좌석보다 많은 예약은 처리하지 않는다.
 * 마지막에 두 관람객의 예약 좌석 수와 남은 좌석 수를 출력한다.
 */
// 관람객 이름과 지금까지 예약한 좌석 수를 보관한다.
class Customer {
    // 계좌 예금주, 회원, 관람객 등 이 객체와 연결된 이름을 저장한다.
    private String name;
    // 관람객이 예약한 좌석 수의 누계를 저장한다.
    private int reservedSeats;

    // 생성자: 관람객 이름을 저장하고 예약 좌석 수를 0으로 초기화한다.
    public Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    // 예약이 성공한 좌석 수를 관람객의 예약 누계에 더한다.
    public void addReservation(int count) {
        reservedSeats += count;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("이름: " + name + ", 예약 좌석 수: " + reservedSeats);
    }
}

// 영화 제목과 남은 좌석 수를 보관하고 좌석 예약 가능 여부를 확인한다.
class Cinema {
    // 노래 제목 또는 상영 영화 제목을 저장한다.
    private String title;
    // 영화관에서 아직 예약할 수 있는 좌석 수를 저장한다.
    private int availableSeats;

    // 생성자: 영화 제목과 예약 가능한 초기 좌석 수를 저장한다.
    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    // 좌석 수를 먼저 검사하고, 가능하면 남은 좌석과 관람객 예약 수를 함께 갱신한다.
    public void reserve(Customer customer, int count) {
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (count <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        } else if (count > availableSeats) {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        } else {
            availableSeats -= count;
            customer.addReservation(count);
        }
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석 수: " + availableSeats);
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema("어벤져스", 10);
        Customer hong = new Customer("홍길동");
        Customer kim = new Customer("김철수");

        int hongSeats = sc.nextInt();
        int kimSeats = sc.nextInt();

        cinema.reserve(hong, hongSeats);
        cinema.reserve(kim, kimSeats);

        hong.showInfo();
        kim.showInfo();
        cinema.showInfo();
    }
}
