package Lesson5.Task3;

public class Fish extends Animal implements Swim {
    private String name;

    Fish(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Рыбу зовут " + name);
    }

    @Override
    public void canSwim() {
        System.out.println("Рыба " + name + " может плавать");
    }
}