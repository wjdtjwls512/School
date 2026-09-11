package test01;

public class TestEx19 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char alpha = 'Z';
        for (int i = 0; i < 26; i++) {
            arr[i] = alpha--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
