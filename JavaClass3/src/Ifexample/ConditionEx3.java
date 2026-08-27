package Ifexample;

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance = 8.5;

        if (distance <= 1) {
            System.out.println("추천 이동 수단: 도보");
        } else if (distance <= 10) {
            System.out.println("추천 이동 수단: 자전거");
        } else if (distance <= 50) {
            System.out.println("추천 이동 수단: 버스");
        } else {
            System.out.println("추천 이동 수단: 기차");
        }
    }
}
