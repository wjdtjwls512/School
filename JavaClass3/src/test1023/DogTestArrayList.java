package test1023;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<Dog>();

        dogList.add(new Dog("멍멍이", "치와와"));
        dogList.add(new Dog("뽀삐", "진돗개"));
        dogList.add(new Dog("순심이", "삽살개"));
        dogList.add(new Dog("철이", "마르티스"));
        dogList.add(new Dog("삐쭈", "푸들"));

        for (Dog dogs : dogList) {
            dogs.showDogInfo();
        }

    }
}
