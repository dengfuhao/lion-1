
package com.gupao.edu.vip.lion.api;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Created by ohun on 2015/12/23.
 *
 * @author ohun@live.cn
 */
public interface Constants {
    Charset UTF_8 = StandardCharsets.UTF_8;
    byte[] EMPTY_BYTES = new byte[0];
    String HTTP_HEAD_READ_TIMEOUT = "readTimeout";
    String EMPTY_STRING = "";
    String ANY_HOST = "0.0.0.0";
    String KICK_CHANNEL_PREFIX = "/lion/kick/";

    static String getKickChannel(String hostAndPort) {
        return KICK_CHANNEL_PREFIX + hostAndPort;
    }

}
