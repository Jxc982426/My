package 基本概念.Java.多线程.同步;

/*
    sleep
        Thread类的静态方法
        不需要锁  任何地方都可以用
        不释放锁
        休眠时间满后，该线程不一定会立即执行，除非此线程具有更高的优先级。或者CPU空闲
        必须捕获异常
        进入阻塞状态（线程睡眠）
    wait
        Object类里的方法
        进入等待队列（线程挂起）
        释放对象锁
        使用notify()方法、notiftAll()方法或者等待指定时间来唤醒当前等待池中的线程
        只能在同步方法或者同步块中使用，否则抛出IllegalMonitorStateException。

*/
public class sleep与wait {
    public sleep与wait() {
        System.out.println("");
    }

    public static void main(String[] args) {
        new sleep与wait();
    }
}
