package cn.xh.demo02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo01 {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/ricky/Documents/Project/" +
                "零基础学JAVA学习专题/极简JAVA五IO流/课堂案例/test/aaa.txt");
        FileOutputStream fo = new FileOutputStream(f,true);

        byte[] bs = "abc".getBytes();
        try{
            fo.write(bs);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            if(fo!=null){
                fo.close();
            }
        }

    }


}

