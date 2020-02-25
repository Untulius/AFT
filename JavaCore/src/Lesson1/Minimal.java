package Lesson1;
/*
1. Написать программу для поиска минимального из двух чисел.
 */

import java.util.Scanner;

public class Minimal {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение первого числа a =");
        a = scanner.nextInt();

        System.out.println("Введите значение второго числа: b =");
        b = scanner.nextInt();

        if (min(a, b) == 0) System.out.println("Числа равны");
        else System.out.println("Минимальное число равно " + min(a, b));

        scanner.close();
    }

    public static int min(int a, int b) {
        if (a < b) return a;
        else if (b < a) return b;
        else return 0;
    }

}
