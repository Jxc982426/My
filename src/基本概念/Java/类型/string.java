package 基本概念.Java.类型;

import org.junit.Test;

/*

    String
        引用类型
        底层为 char[]
*/
public class string {
    public static void main(String[] args) {


        String s1 = "AB";
        String s2 = new String("AB");
        String s3 = "A";
        String s4 = "B";
        String s5 = "A" + "B";
        String s6 = s3 + s4;


        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }

    @Test
    public void testFinction(){
        String num = "01234567890123456789";

        System.out.println(num.getClass() + "  " + num);
        System.out.println(num.length());
        System.out.println(num.indexOf("4"));
        System.out.println(num.indexOf("45", 4));
        System.out.println(num.indexOf("45", 5));
        System.out.println(num.indexOf(4));
        System.out.println(num.lastIndexOf(4));
        System.out.println(num.indexOf(4, 5));

        //  +  String 中  变为 StringBuilder 进行操作
    }




}
