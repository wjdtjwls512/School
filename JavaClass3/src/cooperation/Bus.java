package cooperation;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void takePerson() {
        money += 1100;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원입니다.");
    }
}
