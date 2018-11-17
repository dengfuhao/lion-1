
package com.gupao.edu.vip.lion.core.ack;

/**
 * Created by ohun on 16/9/6.
 *
 * @author ohun@live.cn (夜色)
 */
public interface AckCallback {
    void onSuccess(AckTask context);

    void onTimeout(AckTask context);
}
