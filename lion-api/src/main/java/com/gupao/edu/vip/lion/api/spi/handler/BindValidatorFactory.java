
package com.gupao.edu.vip.lion.api.spi.handler;

import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 16/10/19.
 *
 * @author ohun@live.cn (夜色)
 */
public interface BindValidatorFactory extends Factory<BindValidator> {
    static BindValidator create() {
        return SpiLoader.load(BindValidatorFactory.class).get();
    }
}
