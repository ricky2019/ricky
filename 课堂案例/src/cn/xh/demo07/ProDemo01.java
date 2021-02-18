package cn.xh.demo07;

import java.util.Properties;
import java.util.Set;

public class ProDemo01 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("aaa","111");
        properties.setProperty("bbb","222");
        Set<String> keys = properties.stringPropertyNames();   //   获取所有的键
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println("key = "+key+"   value="+value);
        }

    }

}
