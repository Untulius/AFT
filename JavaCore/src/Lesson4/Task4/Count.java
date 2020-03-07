package Lesson4.Task4;

/*
2. Поэкспериментировать с ключевым словом final
4. Реализовать класс в конструкторе которого будет счетчик количества
создаваемых объектов. Написать метод для получения информации о
количестве.
 */
public final class Count {
    private static int objectscount;

    public Count() {
        objectscount++;
        System.out.println("Создан экземпляр класса Count #" + objectscount);
    }

    public void getCount() {
        System.out.println("Количество созданных экземпляров класса Count: " + objectscount);
    }
}
