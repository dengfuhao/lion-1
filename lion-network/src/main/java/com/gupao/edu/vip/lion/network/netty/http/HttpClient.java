
package com.gupao.edu.vip.lion.network.netty.http;

import com.gupao.edu.vip.lion.api.service.Service;

/**
 * Created by ohun on 2016/2/15.
 *
 * @author ohun@live.cn
 */
public interface HttpClient extends Service {
    void request(RequestContext context) throws Exception;
}
