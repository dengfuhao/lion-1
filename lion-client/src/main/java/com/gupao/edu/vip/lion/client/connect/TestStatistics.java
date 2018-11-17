
package com.gupao.edu.vip.lion.client.connect;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ohun on 2016/12/8.
 *
 * @author ohun@live.cn (夜色)
 */
public final class TestStatistics {
    public AtomicInteger clientNum = new AtomicInteger();
    public AtomicInteger connectedNum = new AtomicInteger();
    public AtomicInteger bindUserNum = new AtomicInteger();
    public AtomicInteger receivePushNum = new AtomicInteger();

    @Override
    public String toString() {
        return "TestStatistics{" +
                "clientNum=" + clientNum +
                ", connectedNum=" + connectedNum +
                ", bindUserNum=" + bindUserNum +
                ", receivePushNum=" + receivePushNum +
                '}';
    }
}
