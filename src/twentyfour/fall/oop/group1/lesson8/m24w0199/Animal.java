package twentyfour.fall.oop.group1.lesson8.m24w0199;
//Stu
public class Animal {

    private String name;
    private int age;
    private boolean isWild;

    public Animal(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }

    public void makeSound() {
        // Empty method for overriding in subclasses
    }

    public void displayInfo() {
        System.out.println("Animal's Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Wild: " + isWild);
    }

    // Getters and setters (optional, based on your needs)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;

    }
}