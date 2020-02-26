package Lesson6.Task1;

/*
1. Написать класс PersonSuperComparator, который имплементит Comparator,
но умеет сравнивать по двум параметрам: возраст и имя. Класс Person
теперь содержит два поля int age и String name.
 */
public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public String compare(Person a, Person b) {
        if ((a.getName().compareTo(b.getName()) == 0) && (a.getAge() == b.getAge())) {
            return "Объекты идентичны по имени и возрасту";
        } else if (a.getAge() == b.getAge()) {
            return "Возраст объектов идентичен";
        } else if ((a.getName().compareTo(b.getName()) == 0)) {
            return "Имена объектов идентичны";
        } else return "Объекты совершенно разные";

    }
}
