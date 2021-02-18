package cn.xh.demo03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("test.txt");
        FileOutputStream output = new FileOutputStream("testCopy.txt");

        int ch = 0;
        while((ch=input.read())!=-1){
            output.write(ch);
        }

        input.close();
        output.close();
    }

}
