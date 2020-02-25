package Lesson5.Task4;

public class Runner extends Human {
    private int time;

    Runner(int time) {
        this.time = time;
    }

    @Override
    public void isRun() {
        if (time < 60) {
            System.out.println("Время забега " + time + " минут");
        } else {
            System.out.println("Спустя " + time + " минут бегун устал и идёт пешком");
        }
    }

    @Override
    public void isSwim() {
        System.out.println("Бегуны бегают быстрее чем плавают");
    }
}
