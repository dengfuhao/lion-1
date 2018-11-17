
package com.gupao.edu.vip.lion.cache.redis.mq;

import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.common.MQClient;
import com.gupao.edu.vip.lion.api.spi.common.MQClientFactory;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 1)
public final class RedisMQClientFactory implements MQClientFactory {
    private ListenerDispatcher listenerDispatcher = new ListenerDispatcher();

    @Override
    public MQClient get() {
        return listenerDispatcher;
    }
}
