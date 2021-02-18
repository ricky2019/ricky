package cn.xh.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDemo01 {

    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("/Users/ricky/Documents/Project/零基础学JAVA学习专题/极简JAVA五IO流/课堂案例/test/test.txt");

//        System.out.println(fi.read());
//        System.out.println((char)fi.read());
//        System.out.println((char)fi.read());
//        System.out.println(fi.read());

        int ch = 0;
        while((ch=fi.read())!=-1){
            System.out.println((char)ch);
        }

        fi.close();
    }


}
