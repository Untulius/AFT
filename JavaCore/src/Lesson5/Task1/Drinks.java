package Lesson5.Task1;

public enum Drinks {
    COLA("Кока-Кола", 91),
    SPRITE("Sprite", 87),
    LIPTON("Lipton", 59),
    TEA("Чай черный", 30),
    COFFEE("Кофе", 45);

    private String name;
    private int price;

    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
