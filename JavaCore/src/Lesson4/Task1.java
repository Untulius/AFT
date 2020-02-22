package Lesson4;

import java.util.Scanner;

/*
1. Напишите программу которая получает на вход некую строку, после она
вызывает метод, заменяющий в строке все вхождения слова «бяка» на
«вырезано цензурой» и выводит результат в консоль!
 */
public class Task1 {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        s = scanner.nextLine();
        System.out.println("Введенная строка: " + s);
        change(s);
        scanner.close();
    }
    public static void change(String s){
        String s1;
        s1 = s.replaceAll("бяка", "вырезано цензурой");
        System.out.println("Измененная строка: " + s1);
    }
}
