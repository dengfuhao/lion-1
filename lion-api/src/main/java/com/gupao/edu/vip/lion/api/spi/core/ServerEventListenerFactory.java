
package com.gupao.edu.vip.lion.api.spi.core;

import com.gupao.edu.vip.lion.api.common.ServerEventListener;
import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 16/10/19.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ServerEventListenerFactory extends Factory<ServerEventListener> {
    static ServerEventListener create() {
        return SpiLoader.load(ServerEventListenerFactory.class).get();
    }
}
