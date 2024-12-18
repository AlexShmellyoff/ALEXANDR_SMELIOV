package homework_nr_16;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    public void addDogToList(List<? super Dog> animals){
        Dog dog = new Dog();
        animals.add(dog);

    }

    public void makeAllAnimalsSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        List<Animal> animals = new ArrayList<>();
        animalShelter.addDogToList(animals);
        animals.add(new Cat());
        animalShelter.makeAllAnimalsSound(animals);

    }
}
