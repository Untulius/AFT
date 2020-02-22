package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Реализовать алгоритм сортировки массива пузырьком и попытаться его
оптимизировать. Оптимизацию будем "считать" количеством итераций
цикла
 */
public final class Task1 {
    public static void main(String[] args) {
        int[] arr, arr1;
        int n, count=0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размерность массива");
        n = scanner.nextInt();
        arr = new int[n];
        arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.print("Исходный массив: " + Arrays.toString(arr));
        System.out.println();
        System.arraycopy(arr, 0, arr1, 0, arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                count++;
            }
        }
        System.out.println("Обычная сортировка пузырьком: " + Arrays.toString(arr));
        System.out.println("Число итераций " + count);

        count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i]>arr1[j]){
                    int tmp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = tmp;
                }
                count++;
            }
        }
        System.out.println("Модифицированная сортировка пузырьком: " + Arrays.toString(arr1));
        System.out.println("Число итераций " + count);

    }
}
