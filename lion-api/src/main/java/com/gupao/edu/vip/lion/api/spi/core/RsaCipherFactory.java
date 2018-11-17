
package com.gupao.edu.vip.lion.api.spi.core;

import com.gupao.edu.vip.lion.api.connection.Cipher;
import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by yxx on 2016/5/19.
 *
 * @author ohun@live.cn
 */
public interface RsaCipherFactory extends Factory<Cipher> {
    static Cipher create() {
        return SpiLoader.load(RsaCipherFactory.class).get();
    }
}
