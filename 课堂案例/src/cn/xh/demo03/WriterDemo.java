package cn.xh.demo03;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("s4.txt");

        writer.write("我爱北京");
        writer.flush();
        writer.close();

    }

}
