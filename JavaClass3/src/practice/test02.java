package practice;

public class test02 {
    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수: " + score);

        switch (score / 10) {
            case 10, 9:
                System.out.println("등급: A");
                break;
            case 8:
                System.out.println("등급: B");
                break;
            case 7:
                System.out.println("등급: C");
                break;
            default:
                System.out.println("등급: D");
        }
    }
}
