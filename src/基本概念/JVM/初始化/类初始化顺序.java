package 基本概念.JVM.初始化;

public class 类初始化顺序 {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
            //调用类的静态方法时（主动使用 类加载）

        System.out.println("const1=" + Singleton.const1);
        System.out.println("const2=" + Singleton.const2);
    }
}

class Singleton{

//    public static int const1;
    public static int const1 = 1;
        /*   ②的基础上  const1 = 1;
        const1=2
        const2=0
        */
//    public static int const2 = 0;
        /*①
        const1=1
        const2=1
        */

    private static Singleton singleton= new Singleton();
    //准备  = null    初始化时使用Singleton

        //连接时的准备阶段  const1 const2 都为0
    private Singleton(){
        const1++;
        const2++;
        System.out.println(const1);
        System.out.println(const2);
        //初始化时const2 被赋值为0    const1 没有初始化
    }

    //将const2  放在这②
    public static int const2 = 0;
        /*
        const1=1
        const2=0
        */

    public static Singleton getInstance(){
        return singleton;
    }
}
