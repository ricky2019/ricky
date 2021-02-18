package cn.xh.demo04;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferDemo1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("s1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(out);

        bout.write("hello".getBytes());
        bout.close();
    }


}
