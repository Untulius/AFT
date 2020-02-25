package Lesson5.Task2;

public class Dog extends Animal {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Собаку зовут " + name);
    }
}