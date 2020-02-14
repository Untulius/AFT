package Lesson1;

import java.util.Scanner;

public class DescriptionOfNumber {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = scanner.nextInt();

        if (a==0) System.out.println("Введенное вами число является нулем");
            else {
                System.out.print("Введенное вами число ");
                if (a % 2 == 0) System.out.print("чётное, ");
                    else System.out.print("нечетное, ");
                if (a<0) System.out.println("отрицательное");
                    else System.out.println("положительное");
        }

        scanner.close();

    }


}
