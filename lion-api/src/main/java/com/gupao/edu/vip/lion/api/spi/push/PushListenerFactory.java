

package com.gupao.edu.vip.lion.api.spi.push;

import com.gupao.edu.vip.lion.api.spi.Factory;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by ohun on 2016/12/24.
 *
 * @author ohun@live.cn (夜色)
 */
public interface PushListenerFactory<M extends IPushMessage> extends Factory<PushListener<M>> {

    @SuppressWarnings("unchecked")
    static <M extends IPushMessage> PushListener<M> create() {
        return (PushListener<M>) SpiLoader.load(PushListenerFactory.class).get();
    }
}
