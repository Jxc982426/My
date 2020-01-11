package 基本概念.Java.类型;

import org.junit.Test;

/*
    static
        属性，方法，代码段，内部类（静态内部类或嵌套内部类）
        类加载时初始化
        与对象无关  与类有关
        可以在静态块中重新定义为静态块局部变量
    fianl
        属性，方法，类，局部变量（方法中的变量）
        编译运行时都可以
        ！！引用实例的内容可以修改
            属性不能修改
            方法不能重写
            类不能继承

*/
public class static与final {


    public static void main(String[] args) {
        final A a = new A(1, "123");
        System.out.println(a.toString());
        a.setAa(11);
        System.out.println(a.toString());
    }

    @Test
    public void test(){
        final A a = new A(1,"bb");
        System.out.println(a.getAa());
        a.setAa(2);
        System.out.println(a.getAa());
    }




    static class A {
        private int aa;
        private String bb;

        @Override
        public String toString() {
            return "A{" +
                    "aa=" + aa +
                    ", bb='" + bb + '\'' +
                    '}';
        }

        public int getAa() {
            return aa;
        }

        public void setAa(int aa) {
            this.aa = aa;
        }

        public String getBb() {
            return bb;
        }

        public void setBb(String bb) {
            this.bb = bb;
        }

        public A(int aa, String bb) {
            this.aa = aa;
            this.bb = bb;
        }
    }
}
