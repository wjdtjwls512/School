package Ifexample;

public class ConditionEx2 {
    public static void main(String[] args) {
        int temp = 23;

        if (temp >= 30) {
            System.out.println("더운 날씨입니다.");
        } else if (temp >= 20) {
            System.out.println("따뜻한 날씨입니다.");
        } else if (temp >= 10) {
            System.out.println("쌀쌀한 날씨입니다.");
        } else {
            System.out.println("추운 날씨입니다.");
        }
    }
}
