

package com.gupao.edu.vip.lion.api.spi.push;

import com.gupao.edu.vip.lion.api.common.Condition;

/**
 * Created by ohun on 2016/12/24.
 *
 * @author ohun@live.cn (夜色)
 */
public interface IPushMessage {

    boolean isBroadcast();

    String getUserId();

    int getClientType();

    byte[] getContent();

    boolean isNeedAck();

    byte getFlags();

    int getTimeoutMills();

    default String getTaskId() {
        return null;
    }

    default Condition getCondition() {
        return null;
    }

    default void finalized() {

    }

}
