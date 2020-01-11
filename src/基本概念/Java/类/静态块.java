package 基本概念.Java.类;

/*
    静态块中如果定义了相同的变量，那么此变量在声明之后即变为静态块中的局部变量
 */
public class 静态块 {
    private static void my() {
        y = x++ + ++x;
    }

    private static int x, y;

    static {
        System.out.println(x);
        int x = 10;
        System.out.println(x);
    }

    private static int cnt = 6;

    static {
        cnt = 100;
        System.out.println(cnt);
    }

    static {
        System.out.println(cnt);
        int cnt = 1000;
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        System.out.println(cnt + " " + x);
        x--;
        my();
        x++;
        System.out.println(x + y++ + x);
    }

}
