package test1023;

public class Dog {
    private String name;
    private String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void showDogInfo() {
        System.out.println(name + ", " + type);
    }
}
