package homework_nr_10;

public abstract class Erbivor {
    double weight;
    String favoriteFood;

    public abstract void eatGrass();

    public void digest() {
        System.out.println("Переваривает пищу как травоядное животное");
    }
}
