package com.gupao.edu.vip.lion.api.service;

/**
 * Created by yxx on 2016/5/27.
 *
 * @author ohun@live.cn (夜色)
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
