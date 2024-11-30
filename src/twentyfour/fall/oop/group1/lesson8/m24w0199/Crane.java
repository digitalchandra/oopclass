package twentyfour.fall.oop.group1.lesson8.m24w0199;

public class Crane extends Animal {

    private int wingspan;

    public Crane(String name, int age, boolean isWild, int wingspan) {
        super(name, age, isWild);
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println("Karu! Karu!"); // Crane sound in Japanese
    }

    public void dance() {
        System.out.println("The crane dances in the wind.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class displayInfo
        System.out.println("Wingspan: " + wingspan + " cm");
    }
}