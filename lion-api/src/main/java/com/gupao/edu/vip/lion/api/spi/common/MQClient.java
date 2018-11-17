
package com.gupao.edu.vip.lion.api.spi.common;

import com.gupao.edu.vip.lion.api.spi.Plugin;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
public interface MQClient extends Plugin {

    void subscribe(String topic, MQMessageReceiver receiver);

    void publish(String topic, Object message);
}
