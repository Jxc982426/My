package 基本概念.Java.多线程;

import org.junit.Test;

public class 基本 {

    @Test
    public void test1(){
        new Thread(){
            @Override
            public void run() {
                while(true){
                    try{
                        System.out.println("first");
                        Thread.sleep(2000);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(() -> {
            while(true){
                try{
                    System.out.println("second");
                    Thread.sleep(2000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        System.out.println("Third");
                        Thread.sleep(2000);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();



    }




}
