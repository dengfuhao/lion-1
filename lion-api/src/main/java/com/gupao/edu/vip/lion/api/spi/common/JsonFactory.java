
package com.gupao.edu.vip.lion.api.spi.common;

import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 2016/12/17.
 *
 * @author ohun@live.cn (夜色)
 */
public interface JsonFactory extends Factory<Json> {

    static Json create() {
        return SpiLoader.load(JsonFactory.class).get();
    }
}
