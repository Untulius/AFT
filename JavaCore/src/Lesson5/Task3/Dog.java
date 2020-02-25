package Lesson5.Task3;

public class Dog extends Animal implements Run, Swim {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Собаку зовут " + name);
    }

    @Override
    public void canSwim() {
        System.out.println("Пёс " + name + " может плавать");
    }

    @Override
    public void canRun() {
        System.out.println("Пёс " + name + " может бегать");
    }
}