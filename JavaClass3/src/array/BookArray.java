package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];

        book[0] = new Book("데미안", "헤르만 헤세");
        book[1] = new Book("토지", "박경리");
        book[2] = new Book("연을 쫓는 아이", "할래드 호세이니");
        book[3] = new Book("태백산맥", "조경래");
        book[4] = new Book("어린왕자", "생택쥐페리");

        System.arraycopy(book, 0, bookCopy, 0, book.length);

        System.out.println("book");
        for (int i = 0; i < book.length; i++) {
            book[i].showBookInfo();
        }

        book[0].setBookName("니코마코스의 윤리학");
        book[0].setAuthor("아리스토텔레스");

        System.out.println("\nbook 수정");
        for (int i = 0; i < book.length; i++) {
            book[i].showBookInfo();
        }

        System.out.println("\nbookCopy");
        for (int i = 0; i < book.length; i++) {
            bookCopy[i].showBookInfo();
        }
    }
}
