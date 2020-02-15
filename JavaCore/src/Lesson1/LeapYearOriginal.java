package Lesson1;

/*
Написать программу для определения является ли введенный пользователем
год високосным.
    год, номер которого кратен 400, — високосный;
    остальные годы, номер которых кратен 100, — невисокосные;
    остальные годы, номер которых кратен 4, — високосные.
*/

import java.util.Scanner;

public class LeapYearOriginal {
    public static void main(String[] args) {
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        y = scanner.nextInt();

        if (y % 400 == 0) System.out.println("Год " + y + " - високосный");
            else if (y % 100 == 0) System.out.println("Год " + y + " - невисокосный");
                else if (y % 4 == 0) System.out.println("Год " + y + " - високосный");
                    else System.out.println("Год " + y + " - невисокосный");

        scanner.close();
    }
}
