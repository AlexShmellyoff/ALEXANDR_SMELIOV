package homework_nr_10;

public interface Animal {

    int MAX_AGE = 100;
    double MIN_WEIGHT = 1.0;

    void eat();
    void sleep();
    void makeSound();
    void move();

    default void showInfo() {
        System.out.println("Это животное. Максимальный возраст: " + MAX_AGE);
    }

    static void printAnimalInfo() {
        System.out.println("Животные - это живые существа");
    }
}
