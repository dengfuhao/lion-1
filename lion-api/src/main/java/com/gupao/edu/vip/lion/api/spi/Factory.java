
package com.gupao.edu.vip.lion.api.spi;

import java.util.function.Supplier;

/**
 * Created by yxx on 2016/5/18.
 *
 * @author ohun@live.cn
 */
@FunctionalInterface
public interface Factory<T> extends Supplier<T> {
}
