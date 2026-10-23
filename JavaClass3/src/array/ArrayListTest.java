package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> booklist = new ArrayList<Book>();

        booklist.add(new Book("태백산맥", "조정래"));
        booklist.add(new Book("토지", "박경리"));
        booklist.add(new Book("연을 쫓는 아이", "할레드 호세이니"));
        booklist.add(new Book("데미안", "헤르만 헤세"));
        booklist.add(new Book("어린왕자", "생택쥐페리"));

//        for (int i = 0; i < booklist.size(); i++) {
//            booklist.get(i).showBookInfo();
//        }

        for (Book book : booklist) {
            book.showBookInfo();
        }

        booklist.remove(0);

        System.out.println("\n첫번째 요소 제거 후");
        for (Book book : booklist) {
            book.showBookInfo();
        }

        booklist.removeAll(booklist);

        System.out.println("\n모든 요소 제거 후");
        for (Book book : booklist) {
            book.showBookInfo();
        }
        System.out.println(booklist.isEmpty());
    }
}
