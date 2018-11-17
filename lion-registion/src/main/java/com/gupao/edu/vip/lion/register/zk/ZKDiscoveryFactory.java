
package com.gupao.edu.vip.lion.register.zk;

import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.common.ServiceDiscoveryFactory;
import com.gupao.edu.vip.lion.api.srd.ServiceDiscovery;

/**
 * Created by ohun on 2016/12/27.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 1)
public final class ZKDiscoveryFactory implements ServiceDiscoveryFactory {
    @Override
    public ServiceDiscovery get() {
        return ZKServiceRegistryAndDiscovery.I;
    }
}
