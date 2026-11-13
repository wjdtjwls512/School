package polymorphism.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest atest = new AnimalTest();
        atest.moveAnimal(new Human());
        atest.moveAnimal(new Tiger());
        atest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
