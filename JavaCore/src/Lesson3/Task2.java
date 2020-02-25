package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Запросить у пользователя целое число N, создать двумерный массив
размером N на N. Заполнить его случайными числами и вывести на экран
сумму диагоналей массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] arr;
        int n;
        int sum = 0;
        int tmp = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размерность массива n");
        n = scanner.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i][tmp++];
        }
        System.out.println("Сумма диагоналей равна " + sum);
    }
}
