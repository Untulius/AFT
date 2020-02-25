package Lesson4;

import java.util.Scanner;

/*
3. Реализовать класс Calculator, который будет содержать статические методы
для операций вычитания, сложения, умножения, деления и взятия процента от
числа. Класс должен работать как с целыми числами, так и с дробями.
 */
public final class Calculator {
    public static void main(String[] args) {
        double a;
        double b;
        String s = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        a = scanner.nextDouble();
        System.out.println("Введите число b:");
        b = scanner.nextDouble();
        s = scanner.nextLine();
        while (!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%"))) {
            System.out.println("Введите одну из операций: +, -, *, /, %");
            s = scanner.nextLine();
        }
        switch (s) {
            case ("+"):
                add(a, b);
                break;
            case ("-"):
                subtract(a, b);
                break;
            case ("*"):
                multiply(a, b);
                break;
            case ("/"):
                divide(a, b);
                break;
            case ("%"):
                percent(a, b);
                break;
        }
        scanner.close();
    }


    public static void add(Double a, Double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void subtract(Double a, Double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multiply(Double a, Double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void divide(Double a, Double b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public static void percent(Double percent, Double b) {
        System.out.println(percent + "% от числа " + b + " = " + (b * percent / 100));
    }
}
