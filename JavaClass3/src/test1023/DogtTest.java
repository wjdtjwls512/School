package test1023;

public class DogtTest {
    public static void main(String[] args) {
        Dog[] dog = new Dog[5];

        dog[0] = new Dog("멍멍이", "치와와");
        dog[1] = new Dog("뽀삐", "진돗개");
        dog[2] = new Dog("순심이", "삽살개");
        dog[3] = new Dog("철이", "마르티스");
        dog[4] = new Dog("삐쭈", "푸들");

        for (Dog dogs : dog) {
            dogs.showDogInfo();
        }
    }
}
