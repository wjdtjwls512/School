package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person("이순신");
        System.out.println(personLee.name);

        Person personAhn = new Person();
        personAhn.name = "안중근";
        System.out.println(personAhn.name);


        Person personKim = new Person("김도현", 180.0f, 70.0f);
        System.out.println(personKim.name + "의 키는 " + personKim.height + "이고 몸무게는 " + personKim.weight);
    }
}
