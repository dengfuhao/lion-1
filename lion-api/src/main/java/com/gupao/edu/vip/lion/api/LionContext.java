
package com.gupao.edu.vip.lion.api;

import com.gupao.edu.vip.lion.api.common.Monitor;
import com.gupao.edu.vip.lion.api.spi.common.CacheManager;
import com.gupao.edu.vip.lion.api.spi.common.MQClient;
import com.gupao.edu.vip.lion.api.srd.ServiceDiscovery;
import com.gupao.edu.vip.lion.api.srd.ServiceRegistry;

/**
 * Created by ohun on 2017/6/21.
 *
 * @author ohun@live.cn (夜色)
 */
public interface LionContext {

    Monitor getMonitor();

    ServiceDiscovery getDiscovery();

    ServiceRegistry getRegistry();

    CacheManager getCacheManager();

    MQClient getMQClient();

}
