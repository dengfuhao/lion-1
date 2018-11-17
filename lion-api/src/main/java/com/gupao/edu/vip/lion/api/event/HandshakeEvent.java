

package com.gupao.edu.vip.lion.api.event;

import com.gupao.edu.vip.lion.api.connection.Connection;

/**
 * Created by ohun on 2015/12/29.
 *
 * @author ohun@live.cn
 */
public final class HandshakeEvent implements Event {
    public final Connection connection;
    public final int heartbeat;

    public HandshakeEvent(Connection connection, int heartbeat) {
        this.connection = connection;
        this.heartbeat = heartbeat;
    }
}
