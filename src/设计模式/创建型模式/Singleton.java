package 设计模式.创建型模式;

public class Singleton {
    public static void main(String[] args) {
        singleOne.getInstance();
        singleTwo.getInstance();
        singleThree.getInstance();
    }

}


class singleOne {
    private static singleOne s1 = null;

    private singleOne() {
        //私有构造方法  防止被实例化
    }

    public static singleOne getInstance() {
        //if (s1 == null) {
            //synchronized (s1) {
                if (s1 == null) {
                    s1 = new singleOne();
                }
            //}
        //}
        System.out.println("singleOne返回了s1");
        return s1;
        //为了使其在多线程下可以正常运行
        //首先采用synchornized方法  但是每次获得s1时都要加锁

        //然后采用synchornized方法块 只有在第一次时才加锁 锁住if 因为s1只会==null一次
        /*
        if (s1 == null) {
            synchronized (s1) {
                if (s1 == null) {
                    s1 = new singleOne();
                }
            }
        }         */

    }
}



//以上方法其实在 jvm 中  存在问题
// jvm不能保证 s1 = new singleOne的顺序  （1 singleOne分配空间  赋给s1  初始化singleOne   ！！！
//                                         2 singleOne分配空间  初始化singleOne  赋给s1  ）
class singleTwo{
    private static singleTwo s1 = new singleTwo();

    private singleTwo() {
        //私有构造方法  防止被实例化
    }

    public static singleTwo getInstance() {
        System.out.println("singleTwo返回了s1");
        return s1;
    }
}



//实际上  jvm使用内部类来维护单例的实现
//JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
class singleThree{
    public singleThree() {
        //私有构造方法  防止被实例化
    }
    //内部类实现
    private static class single{
        private static singleThree s1 = new singleThree();
    }
    //提供外部获得s1
    public static singleThree getInstance(){
        System.out.println("singleThree返回了s1");
        return single.s1;
    }
    //其实这也会有问题  一旦内部类抛出异常  实例将永远得不到创建
}











