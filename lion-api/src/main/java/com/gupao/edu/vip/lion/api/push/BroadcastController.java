
package com.gupao.edu.vip.lion.api.push;

import java.util.List;

/**
 * Created by ohun on 16/10/25.
 *
 * @author ohun@live.cn (夜色)
 */
public interface BroadcastController {

    String taskId();

    int qps();

    void updateQps(int qps);

    boolean isDone();

    int sendCount();

    void cancel();

    boolean isCancelled();

    int incSendCount(int count);

    void success(String... userIds);

    List<String> successUserIds();

}
