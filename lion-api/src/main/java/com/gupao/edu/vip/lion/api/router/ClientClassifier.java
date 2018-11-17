
package com.gupao.edu.vip.lion.api.router;

import com.gupao.edu.vip.lion.api.spi.router.ClientClassifierFactory;

/**
 * Created by ohun on 16/10/26.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ClientClassifier {
    ClientClassifier I = ClientClassifierFactory.create();

    int getClientType(String osName);
}
