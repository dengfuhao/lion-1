
package com.gupao.edu.vip.lion.test.util;

import com.gupao.edu.vip.lion.tools.Utils;
import org.junit.Test;

/**
 * Created by ohun on 16/9/8.
 *
 * @author ohun@live.cn (夜色)
 */
public class IPTest {
    @Test
    public void getLocalIP() throws Exception {
        System.out.println(Utils.lookupLocalIp());
        System.out.println(Utils.lookupExtranetIp());

    }
}

