
package com.gupao.edu.vip.lion.bootstrap.job;

import com.gupao.edu.vip.lion.api.spi.common.CacheManagerFactory;

/**
 * Created by yxx on 2016/5/14.
 *
 * @author ohun@live.cn
 */
public final class CacheManagerBoot extends BootJob {

    @Override
    protected void start() {
        CacheManagerFactory.create().init();
        startNext();
    }

    @Override
    protected void stop() {
        stopNext();
        CacheManagerFactory.create().destroy();
    }
}
