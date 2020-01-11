package 基本概念.Java.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;

/*
    线程池
        不支持 Thread  只接受 Runnable Callable
        减少创建和销毁的次数  效率得到提高
*/
public class 线程池 {
    public 线程池() {
        System.out.println("");
    }

    public static void main(String[] args) {
        new 线程池();
//        Thread thread = new Thread();

//        ThreadPoolExecutor a;
//        a = new ThreadLocalRandom();




/*
    new SingleThreadExecutor()：
            它的特点在于工作线程数目被限制为 1，操作一个无界的工作队列，所以它保证了所有任务的都是被顺序执行，
            最多会有一个任务处于活动状态，并且不允许使用者改动线程池实例，因此可以避免其改变线程数目；
    new CachedThreadPool()：
            它是一种用来处理大量短时间工作任务的线程池，具有几个鲜明特点：它会试图缓存线程并重用，当无缓存线程可用时，
            就会创建新的工作线程；如果线程闲置的时间超过 60 秒，则被终止并移出缓存；长时间闲置时，这种线程池，不会消耗什么资源。
            其内部使用 SynchronousQueue 作为工作队列；
    new FixedThreadPool(int nThreads)：
            重用指定数目（nThreads）的线程，其背后使用的是无界的工作队列，任何时候最多有 nThreads 个工作线程是活动的。
            这意味着，如果任务数量超过了活动队列数目，将在工作队列中等待空闲线程出现；如果有工作线程退出，将会有新的工作线程被创建，
            以补足指定的数目 nThreads；
    new SingleThreadScheduledExecutor()：
            创建单线程池，返回 ScheduledExecutorService，可以进行定时或周期性的工作调度；
    new ScheduledThreadPool(int corePoolSize)：
            和newSingleThreadScheduledExecutor()类似，创建的是个 ScheduledExecutorService，可以进行定时或周期性的工作调度，
            区别在于单一工作线程还是多个工作线程；
    new WorkStealingPool(int parallelism)：
            这是一个经常被人忽略的线程池，Java 8 才加入这个创建方法，其内部会构建ForkJoinPool，利用Work-Stealing算法，
            并行地处理任务，不保证处理顺序；
    ThreadPoolExecutor()：
            是最原始的线程池创建，上面1-3创建方式都是对ThreadPoolExecutor的封装。
*/
















    }
}
