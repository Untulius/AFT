package Lesson3;

import java.util.Scanner;

/*
Реализовать расчет и вывод в консоль последовательности чисел
Фибоначчи до указанного пользователем N, посредством рекурсии
 */
public class Task3 {
    public static void main(String[] args) {
        int N, tmp=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число членов последовательности N: ");
        N = scanner.nextInt();
        System.out.println("Последовательность Фибоначчи: ");
        if (N>=0){
            for (int i = 0; i < N ; i++) {
                System.out.print(fib(i) + " ");
            }
        } else{
            for (int i = 0; i > N ; i--) {
                System.out.print(fib(i) + " ");
            }
        }

    }

    private static int fib(int N)
    {
        if (N==0){
            return 0;
        }
        if (N==1){
            return 1;
        } else
            if (N>0){
                return fib(N-1) + fib(N-2);
            }
            else {
                return fib(N+2) - fib(N+1);
            }

    }
}
