

package com.gupao.edu.vip.lion.api.connection;

import io.netty.channel.Channel;

import java.util.List;

/**
 * Created by ohun on 2015/12/30.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ConnectionManager {

    Connection get(Channel channel);

    Connection removeAndClose(Channel channel);

    void add(Connection connection);

    int getConnNum();

    void init();

    void destroy();
}
