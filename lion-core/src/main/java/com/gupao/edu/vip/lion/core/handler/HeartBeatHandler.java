
package com.gupao.edu.vip.lion.core.handler;

import com.gupao.edu.vip.lion.api.message.MessageHandler;
import com.gupao.edu.vip.lion.api.connection.Connection;
import com.gupao.edu.vip.lion.api.protocol.Packet;
import com.gupao.edu.vip.lion.tools.log.Logs;

/**
 * Created by ohun on 2015/12/22.
 *
 * @author ohun@live.cn
 */
public final class HeartBeatHandler implements MessageHandler {

    @Override
    public void handle(Packet packet, Connection connection) {
        connection.send(packet);//ping -> pong
        Logs.HB.info("ping -> pong, {}", connection);
    }
}
