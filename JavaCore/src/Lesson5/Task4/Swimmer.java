package Lesson5.Task4;

public class Swimmer extends Human {

    @Override
    public void isSwim() {
        System.out.println("Плавцы хорошо плавают");
    }

    @Override
    public void isRun() {
        System.out.println("Плавцы бегают хуже чем плавают");
    }
}
