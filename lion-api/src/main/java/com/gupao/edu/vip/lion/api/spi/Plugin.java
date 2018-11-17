
package com.gupao.edu.vip.lion.api.spi;

import com.gupao.edu.vip.lion.api.LionContext;

/**
 * Created by ohun on 2017/6/21.
 *
 * @author ohun@live.cn (夜色)
 */
public interface Plugin {

    default void init(LionContext context) {

    }

    default void destroy() {

    }
}
