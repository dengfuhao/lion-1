
package com.gupao.edu.vip.lion.test.spi;

import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.common.CacheManager;
import com.gupao.edu.vip.lion.api.spi.common.CacheManagerFactory;

/**
 * Created by ohun on 2016/12/28.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 2)
public final class SimpleCacheMangerFactory implements CacheManagerFactory {
    @Override
    public CacheManager get() {
        return FileCacheManger.I;
    }
}
