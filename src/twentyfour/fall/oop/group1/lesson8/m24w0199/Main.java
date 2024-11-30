package twentyfour.fall.oop.group1.lesson8.m24w0199;

public class Main {

    public static void main(String[] args) {

        // Create Koi and Crane objects
        Koi koi = new Koi("Kinta", 5, false, "Red");
        Crane crane = new Crane("Yuki", 7, true, 220);

        // Create a Zoo object
        Zoo zoo = new Zoo();

        // Add animals to the zoo
        zoo.addAnimal(koi);
        zoo.addAnimal(crane);

        // Display information of all animals
        System.out.println("Zoo Animals:");
        zoo.displayAllAnimals();
        System.out.println();

        // Make all animals make their sound
        System.out.println("Animal Sounds:");
        zoo.makeAllAnimalsMakeSound();
        System.out.println();
    }
}