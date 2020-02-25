package Lesson3;

import java.util.Scanner;

/*
Реализовать расчет и вывод в консоль последовательности чисел
Фибоначчи до указанного пользователем N, посредством рекурсии
 */
public class Task3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число членов последовательности n: ");
        n = scanner.nextInt();
        System.out.println("Последовательность Фибоначчи: ");
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
        } else {
            for (int i = 0; i > n; i--) {
                System.out.print(fib(i) + " ");
            }
        }

    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else if (n > 0) {
            return fib(n - 1) + fib(n - 2);
        } else {
            return fib(n + 2) - fib(n + 1);
        }

    }
}
