package Lesson6.Task2;

import java.util.ArrayList;
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
public class BasketClass implements Basket {
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        System.out.println("В корзину добавлено: " + product + ", " + quantity + " штук");
        products.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        int tmp = products.size();
        for (int i = 0; i < tmp; i++) {
            if (products.get(i).getName().equals(product)) {
                System.out.println("Из корзины удален " + product);
                products.remove(i);
                tmp = products.size();
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product value : products) {
            if (value.getName().equals(product)) {
                value.setQuantity(quantity);
                System.out.println("Количество " + product + " изменено на " + quantity);
            }
        }
    }

    @Override
    public void clear() {
        System.out.println("Корзина очищена!");
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> listProducts = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            listProducts.add(i, products.get(i).getName());
        }
        return listProducts;
    }

    @Override
    public int getProductQuantity(String product) {
        int quantity = 0;
        for (Product value : products) {
            if (value.getName().equals(product)) {
                quantity = value.getQuantity();
                break;
            }
        }
        return quantity;
    }
}
