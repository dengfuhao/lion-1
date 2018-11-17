
package com.gupao.edu.vip.lion.common.handler;

import com.gupao.edu.vip.lion.api.connection.Connection;
import com.gupao.edu.vip.lion.api.protocol.Packet;
import com.gupao.edu.vip.lion.common.message.ErrorMessage;

/**
 * Created by ohun on 2015/12/30.
 *
 * @author ohun@live.cn
 */
public class ErrorMessageHandler extends BaseMessageHandler<ErrorMessage> {
    @Override
    public ErrorMessage decode(Packet packet, Connection connection) {
        return new ErrorMessage(packet, connection);
    }

    @Override
    public void handle(ErrorMessage message) {

    }
}
