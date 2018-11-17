
package com.gupao.edu.vip.lion.api.spi.common;

import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
public interface MQClientFactory extends Factory<MQClient> {

    static MQClient create() {
        return SpiLoader.load(MQClientFactory.class).get();
    }
}
