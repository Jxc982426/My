package 基本概念.JVM;

import org.junit.Test;

public class 被动使用 {
    public static void main(String[] args) {

        //逐条使用  查看不同
        //第一种  未 主动使用子类  子类不加载
        //第二种  主动使用子类 触发主动使用父类
        //类加载VM代码   -XX:+TraceClassLoading

//        System.out.println("子类调用父类的静态变量\n" + B.a);
            /*  父类static block！
                子类调用父类的静态变量
                hello world
            /*
        System.out.println("子类调用子类的静态变量\n" + B.b);
            /*  父类static block！
                子类static block！
                子类调用子类的静态变量
                welcome
            */

    }
    @Test
    public void test1(){
        System.out.println(B.a);
    }
    /* 子类加载  但未进行初始化
        [0.364s][info   ][class,load] 基本概念.JVM.A source: file:/D:/idea/My/out/production/My/
        [0.364s][info   ][class,load] 基本概念.JVM.B source: file:/D:/idea/My/out/production/My/
        父类static block！
        hello world
    */
    @Test
    public void test2(){
        System.out.println(B.b);
    }



}

class A {
    public static String a = "hello world";

    static {
        System.out.println("父类static block！");
    }
}

class B extends A {
    public static String b = "welcome";

    static {
        System.out.println("子类static block！");
    }
}