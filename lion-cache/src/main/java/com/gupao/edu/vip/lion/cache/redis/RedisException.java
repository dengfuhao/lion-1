package com.gupao.edu.vip.lion.cache.redis;

/**
 * Created by yxx on 2016/5/27.
 *
 * @author ohun@live.cn (夜色)
 */
public class RedisException extends RuntimeException {

    public RedisException() {
    }

    public RedisException(Throwable cause) {
        super(cause);
    }

    public RedisException(String message) {
        super(message);
    }

    public RedisException(String message, Throwable cause) {
        super(message, cause);
    }
}
