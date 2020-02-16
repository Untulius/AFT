package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Реализовать алгоритм сортировки массива пузырьком и попытаться его
оптимизировать. Оптимизацию будем "считать" количеством итераций
цикла
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr;
        int n, count=0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размерноесть массива");
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.print("Исходный массив: " + Arrays.toString(arr));
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                count++;
            }
        }
        System.out.println("Отсортированнай массив: " + Arrays.toString(arr));
        System.out.println("Число итераций " + count);
    }
}
