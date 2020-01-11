package 基本概念.JVM.StaticFinal常量;

import org.junit.Test;

public class 编译期可确定常量 {
    public static void main(String[] args) {
        System.out.println(ADefind.a);
        ADefind a = new ADefind();
    }
    @Test
    public void test(){
        int a = ADefind.b1;
        a = ADefind.b2;
        a = ADefind.b3;
        a = ADefind.b4;
        a = ADefind.b5;
        a = ADefind.b6;
        a = ADefind.b7;
        a = ADefind.b8;
        a = ADefind.b9;
        a = ADefind.b10;
    }
}


class ADefind{
    public static final String a = "hello world";
    public static final int b1 = 127;
    public static final int b2 = 128;
    public static final int b3 = 1;
    public static final int b4 = 2;
    public static final int b5 = 3;
    public static final int b6 = 4;
    public static final int b7 = 5;
    public static final int b8 = 6;
    public static final int b9 = 0;
    public static final int b10 = -1;
    //也可以找到相关的class     ICONST.java 等等

    static {
        System.out.println("class Afinal static block");
    }
}