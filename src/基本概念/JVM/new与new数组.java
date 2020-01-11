package 基本概念.JVM;

import org.junit.Test;

public class new与new数组 {

    public static void main(String[] args) {
        Anew a = new Anew();
        Anew[] b = new Anew[4];
    }

    @Test
    public void test1(){
        Anew a = new Anew();
        System.out.println(a.getClass());
    }

    @Test
    public void test2(){
        Anew[] b = new Anew[2];
        System.out.println(b.getClass());
    }
    @Test
    public void test3(){
        int[] c = new int[2];
        System.out.println(c.getClass());

    }
}

class Anew {
    static {
        System.out.println("static block");
    }
}