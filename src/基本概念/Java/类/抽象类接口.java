package 基本概念.Java.类;


/*
                抽象类：
                        单继承
                        可包含抽象方法   也可不含非抽象方法
                        成员变量与class相同
                        面向事物的特性
                        可以有静态方法

                        子类不抽象  需要将父类所有的抽象方法实现


                接口：
                        多继承
                        只声明方法 不实现（抽象方法）
                        public static final 的成员变量
                        面向事物的功能
                        可以被子接口继承
                        不可以有静态方法

                        子类不抽象  需要将接口所有的抽象方法实现



                抽象方法：不可以被修饰为 static native synchronize
                        抽象方法需要子类重写，而静态的方法是无法被重写的。
                        本地方法是由本地代码（如 C 代码）实现的方法，而抽象方法是没有实现的。
                        synchronized 和方法的实现细节有关，抽象方法不涉及实现细节。
*/

public class 抽象类接口 {
    public 抽象类接口() {
        System.out.println("                抽象类：\n" +
                "                        单继承\n" +
                "                        可包含抽象方法   也可不含非抽象方法\n" +
                "                        成员变量与class相同\n" +
                "                        面向事物的特性\n" +
                "\n" +
                "                        子类不抽象  需要将父类所有的抽象方法实现\n" +
                "\n" +
                "\n" +
                "                接口：\n" +
                "                        多继承\n" +
                "                        只声明方法 不实现（抽象方法）\n" +
                "                        public static 的成员变量\n" +
                "                        面向事物的功能\n" +
                "\n" +
                "                        子类不抽象  需要将接口所有的抽象方法实现");
    }

    public static void main(String[] args) {

        new 抽象类接口();
    }


    interface A {
        //父接口
        void f();
    }

    interface B extends A{
        //子接口
        void ff();
    }

    class C implements B{
        //实现子接口  须将其所有的抽象方法实现 包括其父接口的方法
        @Override
        public void ff() {

        }

        @Override
        public void f() {

        }
    }



    interface in{
        public static final int a = 0;
        public void func();
    }


}