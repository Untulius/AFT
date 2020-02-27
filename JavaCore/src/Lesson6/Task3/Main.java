package Lesson6.Task3;

import java.util.HashMap;
import java.util.Map;

/*
3. public boolean isUnique(Map<String, String> map);
Написать метод, который возвращает true, если в мапе нет двух и более
одинаковых value, и false в противном случае. Для пустой мапы метод
возвращает true.
Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров,
Сергей=Савельев, Вадим=Викторов} метод вернет true, а для {Вася=Иванов,
Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод
вернет false.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Вася", "Иванов");
        map1.put("Петр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Вася", "Иванов");
        map2.put("Петр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Петров");

        Map<String, String> map3 = new HashMap<>();

        System.out.println("~~~~~~~~~~~~~~~~~\nПервый Map: ");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~\nВторой Map: ");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~\nПустой Map: ");
        for (Map.Entry<String, String> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~");

        Main main = new Main();
        System.out.println("isUnique для Map1 = " + main.isUnique(map1));
        System.out.println("isUnique для Map2 = " + main.isUnique(map2));
        System.out.println("isUnique для Map3 = " + main.isUnique(map3));
    }

    public boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        }
        int count = 0;
        boolean flag = true;
        String surname;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            surname = entry.getValue();
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
                if (surname.equals(entry1.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                flag = false;
            }
            count = 0;
        }
        return flag;
    }
}
