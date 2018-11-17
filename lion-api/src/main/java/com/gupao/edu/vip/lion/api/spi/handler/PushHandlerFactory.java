
package com.gupao.edu.vip.lion.api.spi.handler;

import com.gupao.edu.vip.lion.api.message.MessageHandler;
import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 16/10/14.
 *
 * @author ohun@live.cn (夜色)
 */
public interface PushHandlerFactory extends Factory<MessageHandler> {
    static MessageHandler create() {
        return SpiLoader.load(PushHandlerFactory.class).get();
    }
}
