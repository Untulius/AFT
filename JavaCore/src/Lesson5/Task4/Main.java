package Lesson5.Task4;

public class Main {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.isRun();
        swimmer.isSwim();

        Runner runner1 = new Runner(40);
        Runner runner2 = new Runner(65);
        runner1.isRun();
        runner2.isRun();
        runner2.isSwim();
    }
}
