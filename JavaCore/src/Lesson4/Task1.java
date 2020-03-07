package Lesson4;

import java.util.Scanner;

/*
1. Напишите программу которая получает на вход некую строку, после она
вызывает метод, заменяющий в строке все вхождения слова «бяка» на
«вырезано цензурой» и выводит результат в консоль!
 */
public class Task1 {
    public static void main(String[] args) {
        String stroka;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        stroka = scanner.nextLine();
        System.out.println("Введенная строка: " + stroka);
        change(stroka);
        scanner.close();
    }

    public static void change(String stroka) {
        String newstroka;
        newstroka = stroka.replaceAll("бяка", "вырезано цензурой");
        System.out.println("Измененная строка: " + newstroka);
    }
}
