
package com.gupao.edu.vip.lion.register.zk;

/**
 * Created by yxx on 2016/5/14.
 *
 * @author ohun@live.cn
 */
public class ZKException extends RuntimeException {

    public ZKException() {
    }

    public ZKException(String message) {
        super(message);
    }

    public ZKException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZKException(Throwable cause) {
        super(cause);
    }
}
