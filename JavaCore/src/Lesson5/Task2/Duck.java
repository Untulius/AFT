package Lesson5.Task2;

public class Duck extends Animal {
    private String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Утку зовут " + name);
    }
}
