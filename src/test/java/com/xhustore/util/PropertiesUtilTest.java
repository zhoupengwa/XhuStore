package com.xhustore.util;

import org.junit.Test;

public class PropertiesUtilTest {

    @Test
    public void test() {
        String maxImageAmount = PropertiesUtil.getValue("goods_image_max_amount");
        System.out.println(maxImageAmount);
    }

}
