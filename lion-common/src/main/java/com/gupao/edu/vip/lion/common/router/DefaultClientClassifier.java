
package com.gupao.edu.vip.lion.common.router;

import com.gupao.edu.vip.lion.api.router.ClientClassifier;
import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.router.ClientClassifierFactory;

/**
 * Created by ohun on 16/10/26.
 *
 * @author ohun@live.cn (夜色)
 */
@Spi(order = 1)
public final class DefaultClientClassifier implements ClientClassifier, ClientClassifierFactory {

    @Override
    public int getClientType(String osName) {
        return ClientType.find(osName).type;
    }

    @Override
    public ClientClassifier get() {
        return this;
    }
}
