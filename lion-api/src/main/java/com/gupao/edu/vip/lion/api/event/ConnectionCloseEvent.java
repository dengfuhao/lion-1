

package com.gupao.edu.vip.lion.api.event;

import com.gupao.edu.vip.lion.api.connection.Connection;

/**
 * Created by ohun on 2016/1/10.
 *
 * @author ohun@live.cn (夜色)
 */
public final class ConnectionCloseEvent implements Event {
    public final Connection connection;


    public ConnectionCloseEvent(Connection connection) {
        this.connection = connection;
    }
}
