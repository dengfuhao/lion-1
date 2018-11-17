
package com.gupao.edu.vip.lion.monitor.jmx;

/**
 * Created by ohun on 16/10/23.
 *
 * @author ohun@live.cn (夜色)
 */
public final class MException extends RuntimeException {
    public MException(String message) {
        super(message);
    }

    public MException(String message, Throwable cause) {
        super(message, cause);
    }

    public MException(Throwable cause) {
        super(cause);
    }
}
