package array;

public class BookArray2 {
    public static void main(String[] args) {
        Book bookA = new Book("태백산맥", "조정래");
        Book bookB = new Book("데미안", "헤르만 헤세");
        Book bookC = new Book("연을 쫓는 아이", "할레드 호세이니");
        Book bookD = new Book("토지", "박경리");
        Book bookE = new Book("어린왕자", "생택쥐페리");

        bookA.showBookInfo();
        bookB.showBookInfo();
        bookC.showBookInfo();
        bookD.showBookInfo();
        bookE.showBookInfo();
    }
}
