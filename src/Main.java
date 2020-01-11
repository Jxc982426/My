public class Main {

    public static void my() {
        y = x++ + ++x;
    }

    public static void main(String[] args) {
        x--;
        my();
        x++;
        System.out.println(x + y++ + x);
    }


    static int x = 2, y;


    static int cnt = 6;

    static {
        cnt = 100;
        System.out.println(cnt);
    }

    static {
        int x = 10;
    }
    static {
        System.out.println(cnt);
        int cnt = 1000;
        System.out.println(cnt);
    }


}
