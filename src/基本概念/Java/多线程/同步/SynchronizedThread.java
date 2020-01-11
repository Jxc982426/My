package 基本概念.Java.多线程.同步;

/*多线程同步

1.同步方法 synchronized
2.同步代码块
3.使用特殊域变量(volatile)实现线程同步
4.使用重入锁实现线程同步
5.使用局部变量实现线程同步
6.使用阻塞队列实现线程同步
7.使用原子变量实现线程同步
*/
/**
 * 线程同步的运用
 *
 * @author XIEHEJUN
 */
public class SynchronizedThread {

    class Bank {

        private int account = 100;

        private int getAccount() {
            return account;
        }

        /**
         * 用同步方法实现    1
         *
         *
         */
        private synchronized void save() {
            account += 10;
        }

        /**
         * 用同步代码块实现   2
         *
         *
         *
         */
        public void save1(int money) {
            synchronized (this) {
                account += money;
            }
        }
    }

    class NewThread implements Runnable {
        private Bank bank;

        private NewThread(Bank bank) {
            this.bank = bank;
        }


        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // bank.save1(10);
                bank.save();
                System.out.println(i + "账户余额为：" + bank.getAccount());
            }
        }

    }

    /**
     * 建立线程，调用内部类
     */
    private void useThread() {
        Bank bank = new Bank();
        NewThread new_thread = new NewThread(bank);

        System.out.println("线程1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();

        System.out.println("线程2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizedThread st = new SynchronizedThread();
        st.useThread();
    }

}


/*  3
//多线程中的非同步问题主要出现在对域的读写上，如果让域自身避免这个问题，则就不需要修改操作该域的方法。
//    用final域，有锁保护的域和volatile域可以避免非同步的问题。
//只给出要修改的代码，其余代码与上同
        class Bank {
            //需要同步的变量加上volatile
            private volatile int account = 100;

            public int getAccount() {
                return account;
            }
            //这里不再需要synchronized
            public void save(int money) {
                account += money;
            }
        ｝
*/

/*   4
//关于Lock对象和synchronized关键字的选择：
//        a.最好两个都不用，使用一种java.util.concurrent包提供的机制，
//            能够帮助用户处理所有与锁相关的代码。
//        b.如果synchronized关键字能满足用户的需求，就用synchronized，因为它能简化代码
//        c.如果需要更高级的功能，就用ReentrantLock类，此时要注意及时释放锁，否则会出现死锁，通常在finally代码释放锁
//只给出要修改的代码，其余代码与上同
        class Bank {

            private int account = 100;
            //需要声明这个锁
            private Lock lock = new ReentrantLock();
            public int getAccount() {
                return account;
            }
            //这里不再需要synchronized
            public void save(int money) {
                lock.lock();
                try{
                    account += money;
                }finally{
                    lock.unlock();
                }

            }
        ｝
*/

/*    5
//ThreadLocal与同步机制
//        a.ThreadLocal与同步机制都是为了解决多线程中相同变量的访问冲突问题。
//        b.前者采用以"空间换时间"的方法，后者采用以"时间换空间"的方式
ThreadLocal 类的常用方法
    ThreadLocal() : 创建一个线程本地变量
    get() : 返回此线程局部变量的当前线程副本中的值
    initialValue() : 返回此线程局部变量的当前线程的"初始值"
    set(T value) : 将此线程局部变量的当前线程副本中的值设置为value
//只改Bank类，其余代码与上同
        public class Bank{
            //使用ThreadLocal类管理共享变量account
            private static ThreadLocal<Integer> account = new ThreadLocal<Integer>(){
                @Override
                protected Integer initialValue(){
                    return 100;
                }
            };
            public void save(int money){
                account.set(account.get()+money);
            }
            public int getAccount(){
                return account.get();
            }
        }
*/
/*
//需要使用线程同步的根本原因在于对普通变量的操作不是原子的。
//那么什么是原子操作呢？
//原子操作就是指将读取变量值、修改变量值、保存变量值看成一个整体来操作
//即-这几种行为要么同时完成，要么都不完成。
//在java的util.concurrent.atomic包中提供了创建了原子类型变量的工具类，
//使用该类可以简化线程同步。
//其中AtomicInteger 表可以用原子方式更新int的值，可用在应用程序中(如以原子方式增加的计数器)，
//但不能用于替换Integer；可扩展Number，允许那些处理机遇数字类的工具和实用工具进行统一访问。

AtomicInteger类常用方法：
AtomicInteger(int initialValue) : 创建具有给定初始值的新的AtomicInteger
addAddGet(int dalta) : 以原子方式将给定值与当前值相加
get() : 获取当前值

//只改Bank类，其余代码与上同
class Bank {
        private AtomicInteger account = new AtomicInteger(100);

        public AtomicInteger getAccount() {
            return account;
        }

        public void save(int money) {
            account.addAndGet(money);
        }
    }
*/

