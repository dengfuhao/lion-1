
package com.gupao.edu.vip.lion.api.spi;

import java.lang.annotation.*;

/**
 * Created by ohun on 16/10/14.
 *
 * @author ohun@live.cn (夜色)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Spi {

    /**
     * SPI name
     *
     * @return name
     */
    String value() default "";

    /**
     * 排序顺序
     *
     * @return sortNo
     */
    int order() default 0;

}
