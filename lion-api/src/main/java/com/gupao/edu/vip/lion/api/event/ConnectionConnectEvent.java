

package com.gupao.edu.vip.lion.api.event;

import com.gupao.edu.vip.lion.api.connection.Connection;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
public final class ConnectionConnectEvent implements Event {
    public final Connection connection;

    public ConnectionConnectEvent(Connection connection) {
        this.connection = connection;
    }
}
