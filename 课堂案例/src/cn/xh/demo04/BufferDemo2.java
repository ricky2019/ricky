package cn.xh.demo04;

import java.io.*;

public class BufferDemo2 {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("s1.txt");
        BufferedInputStream binput = new BufferedInputStream(input);

        int ch = 0;
        while((ch=binput.read()) != -1){
            System.out.println((char)ch);
        }

        binput.close();
    }

}
