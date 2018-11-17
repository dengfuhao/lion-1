
package com.gupao.edu.vip.lion.common.handler;

import com.gupao.edu.vip.lion.api.connection.Connection;
import com.gupao.edu.vip.lion.api.protocol.Packet;
import com.gupao.edu.vip.lion.common.message.OkMessage;

/**
 * Created by ohun on 2015/12/30.
 *
 * @author ohun@live.cn
 */
public class OkMessageHandler extends BaseMessageHandler<OkMessage> {
    @Override
    public OkMessage decode(Packet packet, Connection connection) {
        return new OkMessage(packet, connection);
    }

    @Override
    public void handle(OkMessage message) {

    }
}
