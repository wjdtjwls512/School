package polymorphism.Animal;

public class AnimalTest {
    public static void main(String[] args) {
//        AnimalTest atest = new AnimalTest();
//        atest.moveAnimal(new Human());
//        atest.moveAnimal(new Tiger());
//        atest.moveAnimal(new Eagle());

        Animal ani = new Human();
//        Tiger ti = (Tiger)ani;
//        Human human = (Human) ani;
        if (ani instanceof Tiger ti) {
            ti.move();
        } else if (ani instanceof Human h) {
            h.move();
        }
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
