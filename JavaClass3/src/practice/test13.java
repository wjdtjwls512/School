package practice;

public class test13 {
    public static void main(String[] args) {
        int bookPrice = 12000;
        int money = 20000;

        if (bookPrice > money) {
            System.out.println("책을 구입하지 못했습니다.");
            System.out.printf("용돈이 %d원 모자랍니다.", (bookPrice - money));
        } else {
            System.out.println("책을 구입했습니다.");
            System.out.printf("잔돈이 %d원 남았습니다.", (money - bookPrice));
        }
    }
}
