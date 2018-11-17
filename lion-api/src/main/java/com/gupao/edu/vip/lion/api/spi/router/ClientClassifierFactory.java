
package com.gupao.edu.vip.lion.api.spi.router;

import com.gupao.edu.vip.lion.api.router.ClientClassifier;
import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 16/10/26.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ClientClassifierFactory extends Factory<ClientClassifier> {

    static ClientClassifier create() {
        return SpiLoader.load(ClientClassifierFactory.class).get();
    }
}
