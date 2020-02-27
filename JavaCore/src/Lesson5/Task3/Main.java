package Lesson5.Task3;

/*
3. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
Добавить классам животных из предыдущего задания имплементацию этих
интерфейсов. Некоторые животные могут реализовать больше одного интерфейса
(утка может и плавать, и летать и бегать).
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кошак");
        Dog dog = new Dog("Белый Бим");
        Fish fish1 = new Fish("Карась");
        Duck duck1 = new Duck("Donald");
        cat.canRun();
        dog.canRun();
        dog.canSwim();
        fish1.canSwim();
        duck1.canFly();
        duck1.canRun();
        duck1.canSwim();
    }
}
