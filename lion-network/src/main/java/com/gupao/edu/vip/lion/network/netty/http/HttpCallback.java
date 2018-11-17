
package com.gupao.edu.vip.lion.network.netty.http;


import io.netty.handler.codec.http.HttpResponse;

/**
 * Created by ohun on 2016/2/15.
 *
 * @author ohun@live.cn
 */
public interface HttpCallback {

    void onResponse(HttpResponse response);

    void onFailure(int statusCode, String reasonPhrase);

    void onException(Throwable throwable);

    void onTimeout();

    boolean onRedirect(HttpResponse response);
}
