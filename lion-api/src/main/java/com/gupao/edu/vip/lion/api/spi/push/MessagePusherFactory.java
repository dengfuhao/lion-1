
package com.gupao.edu.vip.lion.api.spi.push;

import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 2016/12/24.
 *
 * @author ohun@live.cn (夜色)
 */
public interface MessagePusherFactory extends Factory<MessagePusher> {

    static MessagePusher create() {
        return SpiLoader.load(MessagePusherFactory.class).get();
    }
}
