
package com.gupao.edu.vip.lion.tools.thread.pool;

import java.util.concurrent.*;

/**
 * Created by yxx on 2016/5/29.
 *
 * @author ohun@live.cn (夜色)
 */
public final class DefaultExecutor extends ThreadPoolExecutor {

    public DefaultExecutor(int corePoolSize, int maximumPoolSize,
                           long keepAliveTime, TimeUnit unit,
                           BlockingQueue<Runnable> workQueue,
                           ThreadFactory threadFactory,
                           RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

}
