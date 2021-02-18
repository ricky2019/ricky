package cn.xh.demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("test.txt");
        FileOutputStream output = new FileOutputStream("testCopy2.txt");

        byte[] bs = new byte[1024];
        int len = 0;
        while((len=input.read(bs))!=-1){
            output.write(bs);
        }

        input.close();;
        output.close();
    }

}
