package Lesson5.Task2;

public class Fish extends Animal {
    private String name;

    Fish(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Рыбу зовут " + name);
    }
}