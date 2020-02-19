package Lesson3;

import java.util.Scanner;

/*
Реализовать расчет и вывод в консоль последовательности чисел
Фибоначчи до указанного пользователем N, посредством рекурсии
 */
public class Task3 {
    public static void main(String[] args) {
        int N, tmp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число членов последовательности N: ");
        N = scanner.nextInt();
        tmp = 0;
        System.out.println("Последовательность Фибоначчи: " + fib(N));
    }

    private static int fib(int N, int tmp)
    {
        if (tmp<N){

        }
    }
}
