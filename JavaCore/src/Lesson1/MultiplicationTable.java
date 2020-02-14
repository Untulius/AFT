package Lesson1;

import java.sql.SQLOutput;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("                                             ТАБЛИЦА УМНОЖЕНИЯ");
        for (int i=1; i<11; i++){
            for (int j=1; j<11; j++){
                System.out.print(j + " x "+ i + " = " + i*j + "    ");
            }
            System.out.println();
        }
    }
}
