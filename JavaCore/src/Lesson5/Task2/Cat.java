package Lesson5.Task2;

public class Cat extends Animal {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Кота зовут " + name);
    }
}
