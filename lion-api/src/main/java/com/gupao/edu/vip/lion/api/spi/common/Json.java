
package com.gupao.edu.vip.lion.api.spi.common;

/**
 * Created by ohun on 2016/12/17.
 *
 * @author ohun@live.cn (夜色)
 */
public interface Json {
    Json JSON = JsonFactory.create();

    <T> T fromJson(String json, Class<T> clazz);

    String toJson(Object json);
}
