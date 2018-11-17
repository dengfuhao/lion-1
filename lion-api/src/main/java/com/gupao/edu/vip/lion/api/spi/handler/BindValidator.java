
package com.gupao.edu.vip.lion.api.spi.handler;

import com.gupao.edu.vip.lion.api.spi.Plugin;

/**
 * Created by ohun on 16/10/19.
 *
 * @author ohun@live.cn (夜色)
 */
public interface BindValidator extends Plugin {
    boolean validate(String userId, String data);
}
