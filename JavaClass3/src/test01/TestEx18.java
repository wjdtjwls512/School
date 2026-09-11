package test01;

public class TestEx18 {
    public static void main(String[] args) {
        String[] array1 = {"가", "나", "다", "라", "마", "바", "사"};
        String[] array2 = {"사", "아", "자", "카", "타", "파", "하"};
        String[] merge = new String[13];

        System.arraycopy(array1, 0, merge, 0, 7);
        System.arraycopy(array2, 1, merge, 7, 6);

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }

    }
}
