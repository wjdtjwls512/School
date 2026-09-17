package practice;

public class test15 {
    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};
        char[] newDecode = new char[10];
        int n = decode.length - 1;

        for (int i = 0; i < decode.length; i++) {
            System.out.print(newDecode[i] = decode[n--]);
        }
    }
}
