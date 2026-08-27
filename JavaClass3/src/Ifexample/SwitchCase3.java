package Ifexample;

public class SwitchCase3 {
    public static void main(String[] args) {
        int month = 10;

        int day = switch (month) {
            case 1 -> 31;
            case 2 -> 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> 0;
        };

        System.out.println(month+"월은 총 " + day + "일입니다");
    }
}
