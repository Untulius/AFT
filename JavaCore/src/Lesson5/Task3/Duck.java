package Lesson5.Task3;

public class Duck extends Animal implements Swim, Fly, Run {
    private String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Утку зовут " + name);
    }

    @Override
    public void canSwim() {
        System.out.println("Утка " + name + " может плавать");
    }

    @Override
    public void canFly() {
        System.out.println("Утка " + name + " может летать");
    }

    @Override
    public void canRun() {
        System.out.println("Утка " + name + " может бегать");
    }
}
