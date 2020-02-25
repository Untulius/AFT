package Lesson5.Task2;

/*
2. Написать абстрактный класс Animal с абстрактным методом getName. Сделать
несколько классов животных, наследников Animal. Метод getName должен выводит
название каждого животного.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кошак");
        Dog dog = new Dog("Белый Бим");
        Fish fish1 = new Fish("Карась");
        Duck duck1 = new Duck("Donald");
        cat.getName();
        fish1.getName();
        dog.getName();
        duck1.getName();
    }
}
