package cn.xh.demo03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("s1.txt");
        int ch = 0;
        while((ch=reader.read())!=-1){
            System.out.println(ch);
            System.out.println((char)ch);
        }

        reader.close();
    }


}
