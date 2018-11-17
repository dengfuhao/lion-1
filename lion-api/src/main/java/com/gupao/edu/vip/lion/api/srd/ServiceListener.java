
package com.gupao.edu.vip.lion.api.srd;

/**
 * Created by ohun on 2016/12/19.
 *
 * @author ohun@live.cn (夜色)
 */
public interface ServiceListener {

    void onServiceAdded(String path, ServiceNode node);

    void onServiceUpdated(String path, ServiceNode node);

    void onServiceRemoved(String path, ServiceNode node);

}
