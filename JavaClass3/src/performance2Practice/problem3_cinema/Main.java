package performance2Practice.problem3_cinema;

import java.util.Scanner;

// 문제 3: 영화관 좌석 예약
class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        reservedSeats = 0;
    }

    public void addReservation(int count) {
        reservedSeats += count;
    }

    public void showInfo() {
        System.out.println("관람객 이름: " + name);
        System.out.println("예약 좌석 수: " + reservedSeats);
    }
}

class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public void reserve(Customer customer, int count) {
        if (count <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        } else if (count > availableSeats) {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        } else {
            availableSeats -= count;
            customer.addReservation(count);
        }
    }

    public void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석 수: " + availableSeats);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema c = new Cinema("어벤져스", 10);

        Customer c1 = new Customer("홍길동");
        Customer c2 = new Customer("김철수");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        c.reserve(c1, n1);
        c.reserve(c2, n2);

        c1.showInfo();
        c2.showInfo();

        c.showInfo();
    }
}
