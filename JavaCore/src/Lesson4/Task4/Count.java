package Lesson4.Task4;
/*
4. Реализовать класс в конструкторе которого будет счетчик количества
создаваемых объектов. Написать метод для получения информации о
количестве.
 */
public class Count {
    private static int count;
    Count(){
        count++;
        System.out.println("Создан экземпляр класса Count #" + count);
    }

    public void getCount(){
        System.out.println("Количество созданных экземпляров класса Count: " + count);
    }
}
