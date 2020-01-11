package 算法Algorithmx第四版;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class My_01 {


    public static void main(String[] args) {

        {
            Array a1 = null;
            int[] a2 = new int[]{1,2,5,7,8,6,4,6,2,1};
            List a3 = null;
            Arrays a4 = null;
        }

        {
            System.out.println('b');
            System.out.println('b' + 'c');
            System.out.println('b' + 3);
            // b
            // 197
            // 101
            System.out.println("" + 'b' + 'c');
            System.out.println("" + 'b' + 3);
            //bc
            //b3
        }
//        MathAbs();

//        关于除零();

//        关于静态方法做参数();

//        关于余数();

//        {
//            //读取控制台的三个数，都相等equal 否则not
//            while (true)
//                Q_1_1_3();
//        }


//        {
//            //斐波那契  递归实现与非递归实现
//            Q_1_1_6();
//        }

//        {
//            //将一个正整数a 由二进制表示  使用库及自己实现
//            Q_1_1_9();
//        }


    }


    public static void MathAbs() {
        System.out.println(Math.abs(-2147483648));
        Integer a = Math.abs(-2147483648);
        System.out.println(Integer.toBinaryString(Math.abs(-2147483648)));
    }

    public static void 关于除零() {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(1.0 / 0);
        Double d = null;
        System.out.println(1.0 / 0 * 0);
//        1000 0000 0000 0000
//        0000 0000 0000 0000
    }

    public static void 关于余数() {
        //余数定义   a / b * b  +  a % b  =  a
        System.out.println(-14 / 3 == 14 / -3 ? 14 / -3 : 0);
        System.out.println(-14 % 3);
        System.out.println(14 % -3);
        // -4
        // -2
        //  2
    }


    public static void 关于静态方法做参数() {
        //？？？B不可以用 A()来做参数，即 静态方法不能用静态方法做参数
        //但是B可以用
        System.out.println(A());

        System.out.println(B(2));
        System.out.println(B(A()));
    }

    public static int B(int a) {
        return a;
    }

    public static int A() {
        final int a = 1;
        return a;
    }


    public static void Q_1_1_3() {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = s.nextInt();
            if (i == 1 && a[1] != a[0] || i == 2 && a[2] != a[0]) {
                System.out.println("not");
                return;
            }
        }
        System.out.println("equle");
        return;
    }

    public static void Q_1_1_6() {
        //斐波那契  递归实现与非递归实现
        int a = new Scanner(System.in).nextInt();
        int first = 0;
        int next = 1;
        for (int i = 0; i < a; i++) {
            System.out.printf("%-5d", first);
            first = first + next;
            next = first - next;
        }

        System.out.println();
        for (int i = 1; i <= a; i++) {
            System.out.printf("%-5d", fibonaqi(i));
        }
    }

    public static int fibonaqi(int n) {
//        System.out.print(n);
//        0    1    1    2    3    5    8    13
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonaqi(n - 2) + fibonaqi(n - 1);
    }

    public static void Q_1_1_9() {
        //将一个正整数a 由二进制表示  使用库及自己实现
        int a = new Scanner(System.in).nextInt();
        System.out.println(Integer.toBinaryString(a));
        String s = "";
        for (int i = a; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }

    @Test
    public void test_1_1_12(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        //9   8   7   6   5   4   3   2   1   0
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        //0   1   2   3   4   4   3   2   1   0
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-4d",a[i]);
        }
    }

}




