package twentyfour.fall.oop.group1.lesson8.m24w0199;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAllAnimals() {
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }

    public void makeAllAnimalsMakeSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
