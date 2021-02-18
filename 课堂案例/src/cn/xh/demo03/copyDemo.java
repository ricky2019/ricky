package cn.xh.demo03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyDemo {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("s1.txt");
        FileWriter  writer = new FileWriter("s3.txt");

        char[] ch = new char[1024];     //    创建缓冲区
        int len = 0;
        while((len = reader.read(ch))!=-1){
            writer.write(ch);
        }

        reader.close();
        writer.close();
    }

}
