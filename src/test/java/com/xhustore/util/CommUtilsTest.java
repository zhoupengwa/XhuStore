package com.xhustore.util;

import java.util.Date;

import org.junit.Test;

public class CommUtilsTest {

    @Test
    public void testGetFormatDate() {
        Date date = CommUtils.getFormatDate();
        System.out.println(date);
    }

}
