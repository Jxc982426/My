package 基本概念.JVM.初始化;

import org.junit.Test;

import java.util.Random;

/*
    接口初始化时 并不要求父接口完成初始化
    只有在真正使用父接口时才初始化父接口
    （主要原因是   默认的 final）

    子类初始化时 父类必须初始化
* */
/*
    IC  IThread 都加载了  但是  IThread的 块并没有输出  说明并没有初始化父接口的thread
    AC  AChread 都加载了  但是  AThread的 块输出了      说明并    初始化父类的Ahread了
*/

public class 接口初始化 {
    public static void main(String[] args) {
        System.out.println(IC.i);
    }

    @Test// IC  IThread 都加载了  但是  IThread的 块并没有输出  说明并没有初始化父接口的thread
    public void testIC() {
        System.out.println(IC.i);
    }

    @Test//AC  AChread 都加载了  但是  AThread的 块输出了      说明并    初始化父类的Ahread了
    public void testAC() {
        System.out.println(AC.i);
    }

    @Test//初始化子接口不会初始化父接口
    public void testB(){
        System.out.println( B.thread);
    }
}

interface IThread {
    public static Thread thread = new Thread() {
        {
            //必须要用代码块
            System.out.println("线程开始！");
        }
    };
}

class IC implements IThread {
    public static int i = 1;
}

///////////////////////////////////////////////////////////////////////////
class AThread {
    public static Thread thread = new Thread() {
        {
            //必须要用代码块
            System.out.println("线程开始！");
        }
    };
}

class AC extends AThread {
    public static int i = 10;
}

///////////////////////////////////////////////////////////////////////////
interface A{
    public static Thread thread = new Thread() {
        {
            //必须要用代码块
            System.out.println("线程A开始！");
        }
    };
}

interface B {
    public static Thread thread = new Thread() {
        {
            //必须要用代码块
            System.out.println("线程B开始！");
        }
    };
}

