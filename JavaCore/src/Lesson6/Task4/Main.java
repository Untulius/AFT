package Lesson6.Task4;

import java.util.LinkedHashSet;
import java.util.Set;

/*
4. public Set<String> removeEvenLength(Set<String> set);
Написать метод, который возвращает множество, в котором удалены все
элементы четной длины из исходного множества.
Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
метод вернет ["foo", "bar", "spoon", "!"]
 */
public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bort");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");

        System.out.println("Исходное множество:\n" + stringSet);

        Main main = new Main();
        System.out.println("Множество без элементов четной длины");
        System.out.println(main.removeEvenLength(stringSet));
    }

    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> stringSetTemp = new LinkedHashSet<>();
        char[] charArr;
        for (String entry : set) {
            charArr = entry.toCharArray();
            if (charArr.length % 2 != 0) {
                stringSetTemp.add(entry);
            }
        }
        return stringSetTemp;
    }
}
