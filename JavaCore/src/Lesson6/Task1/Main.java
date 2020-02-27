package Lesson6.Task1;

import java.util.Arrays;

/*
1. Написать класс PersonSuperComparator, который имплементит Comparator,
но умеет сравнивать по двум параметрам: возраст и имя. Класс Person
теперь содержит два поля int age и String name.
 */
public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Иван", 19);
        persons[1] = new Person("Алексей", 21);
        persons[2] = new Person("Коля", 23);
        persons[3] = new Person("Алексей", 16);
        persons[4] = new Person("Иван", 19);

        System.out.println("----------без сортировки");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        System.out.println("----------сортировка по имени");
        Arrays.sort(persons, new PersonSuperComparator(true));
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        System.out.println("----------сортировка по возрасту");
        Arrays.sort(persons, new PersonSuperComparator(false));
        for (Person person : persons) {
            System.out.println(person.toString());
        }

    }
}
