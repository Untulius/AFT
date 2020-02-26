package Lesson6.Task1;

/*
1. Написать класс PersonSuperComparator, который имплементит Comparator,
но умеет сравнивать по двум параметрам: возраст и имя. Класс Person
теперь содержит два поля int age и String name.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", 19);
        Person person2 = new Person("Алексей", 21);
        Person person3 = new Person("Коля", 23);
        Person person4 = new Person("Иван", 21);
        Person person5 = new Person("Иван", 19);

        PersonSuperComparator psc = new PersonSuperComparator();
        System.out.println(psc.compare(person1, person3));
        System.out.println(psc.compare(person2, person4));
        System.out.println(psc.compare(person1, person5));
        System.out.println(psc.compare(person1, person4));
    }
}
