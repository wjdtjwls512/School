package Ifexample;

public class ConditionEx5 {
    public static void main(String[] args) {
        double rating = 8.6;

        if (rating >= 9) {
            System.out.println("강력 추천합니다.");
        } else if (rating >= 8) {
            System.out.println("추천합니다.");
        } else if (rating >= 7) {
            System.out.println("볼 만합니다.");
        } else {
            System.out.println("추천하지 않습니다.");
        }
    }
}
