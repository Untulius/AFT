package Lesson1;

/*
Написать программу для определения является ли введенный пользователем
год високосным.
Каждый 150-й год – високосный, а также любой год,
который делится на 4.
*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        y = scanner.nextInt();

        if ((y % 150 == 0) || (y % 4 == 0)) System.out.println("Год " + y + " - високосный");
        else System.out.println("Год " + y + " - невисокосный");

        scanner.close();
    }
}
