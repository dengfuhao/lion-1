
package com.gupao.edu.vip.lion.api.spi.client;

import com.gupao.edu.vip.lion.api.push.PushSender;
import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by yxx on 2016/5/18.
 *
 * @author ohun@live.cn
 */
public interface PusherFactory extends Factory<PushSender> {
    static PushSender create() {
        return SpiLoader.load(PusherFactory.class).get();
    }
}
