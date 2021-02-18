package cn.xh.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDemo02 {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("test.txt");
        byte[] bs = new byte[10];
        int len = 0;
        while((len=input.read(bs))!=-1){
            System.out.println();
            System.out.println(new String(bs,0,len));
        }

        input.close();

    }


}
