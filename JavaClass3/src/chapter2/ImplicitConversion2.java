package chapter2;

public class ImplicitConversion2 {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNum2);
        System.out.println(fNum);

        System.out.println(fNum + iNum2);

        double dNum = fNum + iNum;
        System.out.println(dNum);
    }
}
