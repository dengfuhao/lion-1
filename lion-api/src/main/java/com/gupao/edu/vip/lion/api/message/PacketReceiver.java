
package com.gupao.edu.vip.lion.api.message;

import com.gupao.edu.vip.lion.api.connection.Connection;
import com.gupao.edu.vip.lion.api.protocol.Packet;

/**
 * Created by ohun on 2015/12/22.
 *
 * @author ohun@live.cn
 */
public interface PacketReceiver {
    void onReceive(Packet packet, Connection connection);
}
