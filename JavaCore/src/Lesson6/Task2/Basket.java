package Lesson6.Task2;

import java.util.List;

/*
2. Реализовать класс корзины интернет магазина по следующему
интерфейсу:
interface Basket {
void addProduct(String product, int quantity);
void removeProduct(String product);
void updateProductQuantity(String product, int quantity);
void clear();
List<String> getProducts();
int getProductQuantity(String product);
}
 */
public interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
