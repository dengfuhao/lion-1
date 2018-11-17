
package com.gupao.edu.vip.lion.api.spi.net;

import com.gupao.edu.vip.lion.api.service.Service;
import com.gupao.edu.vip.lion.api.spi.SpiLoader;

/**
 * Created by yxx on 2016/5/23.
 *
 * @author ohun@live.cn (夜色)
 */
public interface DnsMappingManager extends Service {

    static DnsMappingManager create() {
        return SpiLoader.load(DnsMappingManager.class);
    }

    DnsMapping lookup(String origin);
}
