package cn.xh.demo07;

import java.io.*;
import java.util.Properties;

public class ProDemo02 {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("aaa", "111");
        properties.setProperty("bbb", "222");

        FileOutputStream fileOutputStream = new FileOutputStream("template/test.properties");
        properties.store(fileOutputStream,"ccc");

        fileOutputStream.close();

        Properties properties1 = new Properties();
        FileInputStream fileInputStream = new FileInputStream("template/test.properties");
        properties1.load(fileInputStream);
        System.out.println(properties1);
    }

}
