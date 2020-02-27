package Lesson5.Task1;
/*
Реализовать программу «Вендинговый автомат», которая позволит:
 Посмотреть меню напитков
 Внести деньги на внутренний счет
 Выбрать номер напитка и получить его, если на счету достаточно средств.
Программа должна обрабатывать следующие ситуации:
 Пользователь не внес деньги
 Пользователь выбрал более дорогой напиток, чем внесено денег
 Пользователь выбрал несуществующий номер напитка
У напитка должна быть цена и название.

1. Переписать проект с урока (вендинговый автомат) используя конструктор,
перечисления и взаимодействие с пользователем.
 */
import java.util.Scanner;

public class Vendingmachine {
    public static void main(String[] args) {
        int account;
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню напитков:");
        System.out.println("Наименование   Цена");
        for (Drinks d : Drinks.values()) {
            System.out.println((d.ordinal() + 1) + ". " + d.getName() + "      " + d.getPrice());
        }

        System.out.println("Внесите деньги");
        account = scanner.nextInt();
        while (account <= 0) {
            System.out.println("Внесите деньги");
            account = scanner.nextInt();
        }

        boolean outFromCycle;
        do {
            outFromCycle = false;
            System.out.println("На счете " + account + " рублей. Введите номер напитка: ");
            System.out.println("Наименование   Цена");
            for (Drinks d : Drinks.values()) {
                System.out.println((d.ordinal() + 1) + ". " + d.getName() + "      " + d.getPrice());
            }
            n = scanner.nextInt();
            while (n <= 0 || n > Drinks.values().length) {
                System.out.println("Вы ввели несуществующий номер напитка. Введите корректный номер: ");
                n = scanner.nextInt();
            }
            while (Drinks.values()[n - 1].getPrice() > account) {
                int num;
                int razn = Drinks.values()[n - 1].getPrice() - account;
                System.out.println("На счете недостаточно средств, внесите ещё " + razn + " рублей или введите 0 для возврата в меню");
                num = scanner.nextInt();
                if (num == 0) {
                    outFromCycle = true;
                    break;
                }
                account += num;
            }
        } while (outFromCycle);
        System.out.println("Возьмите ваш напиток " + Drinks.values()[n - 1].getName() + " и сдачу " + (account - Drinks.values()[n - 1].getPrice()) + " рублей");
        scanner.close();


    }
}
