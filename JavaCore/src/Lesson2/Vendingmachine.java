package Lesson2;
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

 */
import java.util.ArrayList;
import java.util.Scanner;

public class Vendingmachine {
    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<>();
        int acc;
        int n;
        boolean b;
        Scanner scanner = new Scanner(System.in);

        drinks.add(new Drink("Кока-Кола", 91));
        drinks.add(new Drink("Sprite", 87));
        drinks.add(new Drink("Lipton", 59));
        drinks.add(new Drink("Чай черный", 30));
        drinks.add(new Drink("Кофе", 45));

        System.out.println("Меню напитков:");
        System.out.println("Наименование   Цена");
        for (int i = 0; i<drinks.size(); i++) {
            System.out.print(i+1 + ". " + drinks.get(i).getName() + "      " + drinks.get(i).getPrice());
            System.out.println();
        }
        System.out.println("Внесите деньги");
        acc = scanner.nextInt();
        while (acc<=0){
            System.out.println("Внесите деньги");
            acc = scanner.nextInt();
        }

        do {
            b=false;
            System.out.println("На счете " + acc + " рублей. Введите номер напитка: ");
            System.out.println("Наименование   Цена");
            for (int i = 0; i<drinks.size(); i++) {
                System.out.print(i+1 + ". " + drinks.get(i).getName() + "      " + drinks.get(i).getPrice());
                System.out.println();
            }
            n = scanner.nextInt();
            while (n<=0 || n>drinks.size()){
                System.out.println("Вы ввели несуществующий номер напитка. Введите корректный номер: ");
                n = scanner.nextInt();
            }
            while (drinks.get(n-1).getPrice()>acc){
                int num ;
                int razn = drinks.get(n-1).getPrice()-acc;
                System.out.println("На счете недостаточно средств, внесите ещё " + razn + " рублей или введите 0 для возврата в меню");
                num = scanner.nextInt();
                if (num == 0 ){
                    b=true;
                    break;
                }
                acc += num;
            }
        } while (b);
        System.out.println("Возьмите ваш напиток " + drinks.get(n-1).getName() + " и сдачу " + (acc-drinks.get(n-1).getPrice()) + " рублей");
        scanner.close();
    }
}
