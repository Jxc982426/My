package 基本概念.JVM.初始化;

/*
可使用 -XX:+TraceClassLoading  查看加载
    将I1 I2的.class 文件删除   main一样运行
    说明  main运行时   不需要I1  I2的 class文件也就是不加载

    testC2  会使I1 C2加载   删除I1.class后  会提示I1无法被加载
    说明  C2运行时  会加载 I1   需要I1.class
*/

import org.junit.Test;

public class 接口加载 {
    public static void main(String[] args) {
        System.out.println(I2.j);
    }

    @Test
    public void testC2() {
        System.out.println(C2.j);
    }
}


interface I1 {
    public static final int i = 1;
}

interface I2 extends I1 {
    public static final int j = 2;
}

/*
class C1 {
    public static int i = 1;
}*/
class C2 implements I1 {
    public static int j = 2;
}