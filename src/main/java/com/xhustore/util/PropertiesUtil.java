package com.xhustore.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties properties;

    private PropertiesUtil() {
    }

    /**
     * 利用Double-Check最佳创建单例对象
     * 
     * @throws IOException
     */
    private static Properties getInstance() throws IOException {
        if (properties == null) {
            synchronized (PropertiesUtil.class) {
                if (properties == null) {
                    properties = new Properties();
                    properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("common.properties"));
                }
            }
        }
        return properties;
    }

    public static String getValue(String key) {
        try {
            properties = getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }

}
