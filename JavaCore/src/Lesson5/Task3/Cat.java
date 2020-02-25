package Lesson5.Task3;

public class Cat extends Animal implements Run {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Кота зовут " + name);
    }

    @Override
    public void canRun() {
        System.out.println("Кот " + name + " может бегать");
    }
}
