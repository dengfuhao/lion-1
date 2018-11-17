
package com.gupao.edu.vip.lion.common.condition;

import com.gupao.edu.vip.lion.api.common.Condition;

import java.util.Map;

/**
 * Created by ohun on 16/10/24.
 *
 * @author ohun@live.cn (夜色)
 */
public final class AwaysPassCondition implements Condition {
    public static final Condition I = new AwaysPassCondition();

    @Override
    public boolean test(Map<String, Object> env) {
        return true;
    }
}
