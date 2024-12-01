package homework_nr_10;

public class Elephant extends Erbivor implements Animal{
    int age;
    double weight;

    public Elephant(int age, double weight) {
        this.age = age;
        this.weight = weight;
        this.favoriteFood = "листья и трава";
    }

    @Override
    public void eat() {
        System.out.println("Слон есть траву");

    }

    @Override
    public void sleep() {
        System.out.println("Слон спит стоя");

    }

    @Override
    public void makeSound() {
        System.out.println("Слон шумит");

    }

    @Override
    public void move() {
        System.out.println("Слон ходит");

    }

    @Override
    public void eatGrass() {
        System.out.println("Слон ест " + favoriteFood);
    }
}
