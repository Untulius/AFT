package Lesson1;
/*
4. Написать программу, которая выводит арифметическую или
геометрическую прогрессию для N чисел
 */
import java.util.Scanner;

public class Progressions {
    public static void main(String[] args) {
        int n, d, a1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество членов прогрессии: ");
        n = scanner.nextInt();

        System.out.print("Введите шаг/знаменатель прогрессии: ");
        d = scanner.nextInt();

        System.out.print("Введите первый член прогрессии: ");
        a1 = scanner.nextInt();

        System.out.println("Арифметическая прогрессия: ");
        for (int i = 0; i < n; i++) System.out.print(a1+i*d + " ");

        System.out.println();
        System.out.println("Геометрическая прогрессия: ");
        if (d == 0) a1=0;
        System.out.print(a1 + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(a1*d + " ");
            a1=a1*d;
        }
        scanner.close();
    }
}
