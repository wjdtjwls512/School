package test17;

public class BookStore {
    public static void main(String[] args) {
        Book bookA = new Book();
        Book bookB = new Book();

        bookA.setTitle("연을 쫒는 아이");
        bookA.setAuthor("할러드 호세이니");
        bookA.setPrice(18000);

        bookB.setTitle("오디세이아");
        bookB.setAuthor("호메로스");
        bookB.setPrice(27000);

        System.out.println(bookA.getInfo());
        System.out.println(bookB.getInfo());
    }
}
