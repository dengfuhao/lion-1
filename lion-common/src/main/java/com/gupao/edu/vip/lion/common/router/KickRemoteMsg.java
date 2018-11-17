
package com.gupao.edu.vip.lion.common.router;


/**
 * Created by ohun on 16/10/23.
 *
 * @author ohun@live.cn (夜色)
 */
public interface KickRemoteMsg {
    String getUserId();

    String getDeviceId();

    String getConnId();

    int getClientType();

    String getTargetServer();

    int getTargetPort();

    default boolean isTargetMachine(String host, int port) {
        return this.getTargetPort() == port
                && this.getTargetServer().equals(host);
    }
}
