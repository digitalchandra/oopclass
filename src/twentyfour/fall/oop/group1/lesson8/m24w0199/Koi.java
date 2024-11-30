package twentyfour.fall.oop.group1.lesson8.m24w0199;

public class Koi extends Animal {

    private String color;

    public Koi(String name, int age, boolean isWild, String color) {
        super(name, age, isWild); // Call parent class constructor
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("The Koi swims gracefully.");
    }

    public void swim() {
        System.out.println("The Koi swims in the pond.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class displayInfo
        System.out.println("Color: " + color);
    }
}