
package com.gupao.edu.vip.lion.bootstrap.job;

import com.gupao.edu.vip.lion.core.LionServer;

/**
 * Created by ohun on 16/10/25.
 *
 * @author ohun@live.cn (夜色)
 */
public final class RouterCenterBoot extends BootJob {
    private final LionServer lionServer;

    public RouterCenterBoot(LionServer lionServer) {
        this.lionServer = lionServer;
    }

    @Override
    protected void start() {
        lionServer.getRouterCenter().start();
        startNext();
    }

    @Override
    protected void stop() {
        stopNext();
        lionServer.getRouterCenter().stop();
    }
}
