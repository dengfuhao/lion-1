
package com.gupao.edu.vip.lion.api.srd;

import com.gupao.edu.vip.lion.api.service.Service;

/**
 * Created by ohun on 2016/12/19.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ServiceRegistry extends Service {

    void register(ServiceNode node);

    void deregister(ServiceNode node);
}
