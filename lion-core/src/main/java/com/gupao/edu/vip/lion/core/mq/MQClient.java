
package com.gupao.edu.vip.lion.core.mq;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by ohun on 2016/12/26.
 *
 * @author ohun@live.cn (夜色)
 */
public final class MQClient {

    public void init() {

    }

    public void subscribe(String topic, MQMessageReceiver listener) {

    }

    public void publish(String topic, MQPushMessage message) {

    }

    public Collection<MQPushMessage> take(String topic) {
        return Collections.emptyList();
    }
}
