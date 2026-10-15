package test17;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); // 싱글톤 패턴
        Car teslarw = factory.createCar(); // 메서드에서 Car생성
        Car teslarb = factory.createCar();

        System.out.println(teslarw.getCarNum()); // 10001출력
        System.out.println(teslarb.getCarNum()); // 10002출력
    }
}
