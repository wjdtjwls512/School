package Ifexample;

public class ConditionEx8 {
    public static void main(String[] args) {
        int menu = 3;

        switch (menu) {
            case 1 -> System.out.println("선택한 메뉴: 아메리카노");
            case 2 -> System.out.println("선택한 메뉴: 카페라떼");
            case 3 -> System.out.println("선택한 메뉴: 초코라떼");
            case 4 -> System.out.println("선택한 메뉴: 녹차");
            default -> System.out.println("없는 메뉴입니다.");

        }
    }
}
