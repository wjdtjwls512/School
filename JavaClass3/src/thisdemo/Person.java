package thisdemo;

public class Person {
    String name;
    int age;

    Person() {
        this("이하랑", 17);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
