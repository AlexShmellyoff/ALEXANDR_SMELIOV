package homework_nr_10;

public class Main {
    public static void main(String[] args) {
        Animal elephant1 = new Elephant(15, 4000.0);
        elephant1.eat();
        elephant1.sleep();
        elephant1.makeSound();
        elephant1.move();
        elephant1.showInfo();
        Animal.printAnimalInfo();

        Erbivor elephant2 = new Elephant(15, 4000.0);
        elephant2.eatGrass();
        elephant2.digest();
    }
}
