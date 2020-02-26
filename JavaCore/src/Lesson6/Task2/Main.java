package Lesson6.Task2;

import Lesson6.Task1.Person;

public class Main {
    public static void main(String[] args) {
        BasketClass basket = new BasketClass();
        basket.addProduct("Кола", 91);
        basket.addProduct("Sprite", 87);
        basket.addProduct("Lipton", 59);
        basket.addProduct("Чай", 30);
        basket.addProduct("Кофе", 45);

        System.out.println("Товары в корзине: " + basket.getProducts());

        basket.removeProduct("Чай");
        System.out.println("Товары в корзине: " + basket.getProducts());

        System.out.println("Количество Lipton: " + basket.getProductQuantity("Lipton"));
        basket.updateProductQuantity("Lipton", 5);
        System.out.println("Количество Lipton: " + basket.getProductQuantity("Lipton"));
        System.out.println("Товары в корзине: " + basket.getProducts());

        basket.clear();
        System.out.println("Товары в корзине: " + basket.getProducts());

    }
}
