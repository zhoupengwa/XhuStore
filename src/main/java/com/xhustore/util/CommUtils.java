package com.xhustore.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommUtils {
    private static ThreadLocal<DateFormat> dateFormatThreadLocal = new ThreadLocal<>();

    public static Date getFormatDate() {
        Date date = null;
        DateFormat dateFormat = dateFormatThreadLocal.get();
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            dateFormatThreadLocal.set(dateFormat);
        }
        try {
            date = dateFormat.parse(dateFormat.format(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return date;
    }
}
