
package com.gupao.edu.vip.lion.test.spi;

import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.common.ServiceDiscoveryFactory;
import com.gupao.edu.vip.lion.api.srd.ServiceDiscovery;

/**
 * Created by ohun on 2016/12/28.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 2)
public final class SimpleDiscoveryFactory implements ServiceDiscoveryFactory {
    @Override
    public ServiceDiscovery get() {
        return FileSrd.I;
    }
}
