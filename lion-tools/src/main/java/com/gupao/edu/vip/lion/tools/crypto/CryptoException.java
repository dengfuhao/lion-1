
package com.gupao.edu.vip.lion.tools.crypto;

/**
 * Created by ohun on 2015/12/23.
 *
 * @author ohun@live.cn
 */
public class CryptoException extends RuntimeException {

    private static final long serialVersionUID = 368277451733324220L;

    public CryptoException(String message) {
        super(message);
    }

    public CryptoException(String message, Throwable cause) {
        super(message, cause);
    }
}
