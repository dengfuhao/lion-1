
package com.gupao.edu.vip.lion.cache.redis.manager;

import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.common.CacheManager;
import com.gupao.edu.vip.lion.api.spi.common.CacheManagerFactory;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 1)
public final class RedisCacheManagerFactory implements CacheManagerFactory {
    @Override
    public CacheManager get() {
        return RedisManager.I;
    }
}
