
package com.gupao.edu.vip.lion.api.srd;

import com.gupao.edu.vip.lion.api.service.Service;

import java.util.List;

/**
 * Created by ohun on 2016/12/19.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ServiceDiscovery extends Service {

    List<ServiceNode> lookup(String path);

    void subscribe(String path, ServiceListener listener);

    void unsubscribe(String path, ServiceListener listener);
}
