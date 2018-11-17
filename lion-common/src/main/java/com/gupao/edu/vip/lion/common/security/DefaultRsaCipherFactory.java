
package com.gupao.edu.vip.lion.common.security;

import com.gupao.edu.vip.lion.api.connection.Cipher;
import com.gupao.edu.vip.lion.api.spi.Spi;
import com.gupao.edu.vip.lion.api.spi.core.RsaCipherFactory;

/**
 * Created by yxx on 2016/5/19.
 *
 * @author ohun@live.cn
 */
@Spi
public class DefaultRsaCipherFactory implements RsaCipherFactory {
    private static final RsaCipher RSA_CIPHER = RsaCipher.create();

    @Override
    public Cipher get() {
        return RSA_CIPHER;
    }
}
