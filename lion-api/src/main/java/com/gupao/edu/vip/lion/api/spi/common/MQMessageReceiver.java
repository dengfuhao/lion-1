
package com.gupao.edu.vip.lion.api.spi.common;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
public interface MQMessageReceiver {
    void receive(String topic, Object message);
}
