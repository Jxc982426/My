package 源码;

import java.util.Comparator;
import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        Function a = null;


        new Thread(() -> System.out.println("Hellow1")).start();
        new Thread(() -> System.out.println("Hellow2")).start();
        new Thread(() -> System.out.println("Hellow3")).start();
        new Thread(() -> System.out.println("Hellow4")).start();
        new Thread(()-> System.out.println("Hellow5")).start();

        Comparator b = null;
    }









}
