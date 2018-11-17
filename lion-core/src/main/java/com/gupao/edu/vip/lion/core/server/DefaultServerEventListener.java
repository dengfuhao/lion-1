
package com.gupao.edu.vip.lion.core.server;

import com.gupao.edu.vip.lion.api.common.ServerEventListener;
import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.core.ServerEventListenerFactory;

/**
 * Created by ohun on 16/10/19.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 1)
public final class DefaultServerEventListener implements ServerEventListener, ServerEventListenerFactory {

    @Override
    public ServerEventListener get() {
        return this;
    }
}
