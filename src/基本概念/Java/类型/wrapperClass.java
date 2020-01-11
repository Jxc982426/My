package 基本概念.Java.类型;

import org.junit.Test;

/*
    jdk5 之后
        自动拆箱装箱
    原始类型
        boolean     char        byte    short   int         long    float   double
    包装类型
        Boolean     Character   Byte    Short   Integer     Long    Float   Double
*/
public class wrapperClass {

    //   -128  ~  127
    //  Integer 直接引用常量池里的Integer
    @Test
    public void testInteger(){
        Integer a = 127, b = 128, c = 127, d = 128;

        Integer e = -128, f = -128, g = -129, h = -129;

        System.out.println(a == c);
        System.out.println(b == d);

        System.out.println(e == f);
        System.out.println(g == h);
    }


}
