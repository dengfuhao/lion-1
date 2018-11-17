

package com.gupao.edu.vip.lion.api.common;

import java.util.concurrent.Executor;

/**
 * Created by ohun on 2017/7/15.
 *
 * @author ohun@live.cn (夜色)
 */
public interface Monitor {

    void monitor(String name, Thread thread);

    void monitor(String name, Executor executor);
}
