package Lesson6.Task1;

import java.util.Comparator;

/*
1. Написать класс PersonSuperComparator, который имплементит Comparator,
но умеет сравнивать по двум параметрам: возраст и имя. Класс Person
теперь содержит два поля int age и String name.
*/
public class PersonSuperComparator implements Comparator<Person> {
    private boolean sortByName;

    PersonSuperComparator(Boolean sortByName) {
        this.sortByName = sortByName;
    }

    @Override
    public int compare(Person person1, Person person2) {
        if (sortByName) {
            String str1 = person1.getName();
            String str2 = person2.getName();
            return str1.compareTo(str2);
        } else {
            int age1 = person1.getAge();
            int age2 = person2.getAge();

            return Integer.compare(age1, age2);
        }

    }
}
