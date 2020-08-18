package cn.exrick.common.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Exrickx
 */
public class ThreadPoolUtil {

    //线程缓冲队列
    private static BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<Runnable>(100);
    // 核心线程数，会一直存活，即使没有任务，线程池也会维护线程的最少数量
    private static final int SIZE_CORE_POOL = 5;
    // 线程池维护线程的最大数量
    private static final int SIZE_MAX_POOL = 10;
    // 线程池维护线程所允许的空闲时间
    private static final long ALIVE_TIME = 2000;


    private static ThreadPoolExecutor pool = new ThreadPoolExecutor(SIZE_CORE_POOL, SIZE_MAX_POOL, ALIVE_TIME,
            TimeUnit.MILLISECONDS, bqueue, new ThreadPoolExecutor.CallerRunsPolicy());//CallerRunsPolicy:有反馈机制，使提交速度变慢
                                                                                     //abortpolicy:丢弃任务，抛出rejectedExecutionException
                                                                                     //discardpolicy:拒绝执行，不抛异常
                                                                                    //discardoldestpolicy:丢弃任务缓存队列中最老的任务，并且尝试重新提交新任务

    static {

        pool.prestartAllCoreThreads();
    }

    public static ThreadPoolExecutor getPool() {
        return pool;
    }

    public static void main(String[] args) {
        System.out.println(pool.getPoolSize());
    }
}
