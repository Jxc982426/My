package 基本概念.Java.多线程.同步;

/*
    volatile
        底层非原子性演示
*/

public class Volatile {

    static volatile int a = 0;

    static class A extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                a++;
            }
        }
    }

    static volatile int b = 0;

    static class B implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                b++;
            }
        }
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            A x = new A();
            x.start();
        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally!");
//        }
        System.out.println(a);


        for (int i = 0; i < 10; i++) {
            Thread xx = new Thread(new B());
            xx.start();
        }
        System.out.println(b);
    }


}
