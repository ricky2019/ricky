package cn.xh.demo04;

import java.io.*;

public class test {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        method1("s1.txt", "s2.txt");    //    70
//        method2("s1.txt", "s2.txt");     //   2
//        method3("s1.txt", "s2.txt");     //   9
        method4("s1.txt", "s2.txt");     //   1


        long end = System.currentTimeMillis();
        System.out.println(end-start);


    }

    /*
    基本的字节流，1次读取1个字节
     */
    public static void method1(String src, String desc) throws IOException {
        FileInputStream input = new FileInputStream(src);
        FileOutputStream output = new FileOutputStream(desc);

        int ch = 0;
        while((ch = input.read())!=-1){
            output.write((char)ch);
        }

        input.close();
        output.close();
    }

    /*
    基本的字节流，1次读取1个字节数组
     */
    public static void method2(String src,String desc) throws IOException {
        FileInputStream input = new FileInputStream(src);
        FileOutputStream output = new FileOutputStream(desc);
        int ch = 0;
        byte[] bs = new byte[1024];
        while((ch = input.read(bs))!=-1){
            output.write(bs);
        }

        input.close();
        output.close();

    }

    /*
    高效的字节缓冲流, 1次读取1个字节
     */
    public static void method3(String src,String desc) throws IOException {
        FileInputStream input = new FileInputStream(src);
        FileOutputStream output = new FileOutputStream(desc);
        BufferedInputStream binput = new BufferedInputStream(input);
        BufferedOutputStream boutput = new BufferedOutputStream(output);

        int ch = 0;
//        byte[] bs = new byte[1024];
        while((ch = binput.read())!=-1){
            boutput.write(ch);
        }
        binput.close();
        boutput.close();
        input.close();
        output.close();


    }

    /*
    高效的字节缓冲流，1次读取1个字节数组
     */
    public static void method4(String src,String desc) throws IOException {
        FileInputStream input = new FileInputStream(src);
        FileOutputStream output = new FileOutputStream(desc);
        BufferedInputStream binput = new BufferedInputStream(input);
        BufferedOutputStream boutput = new BufferedOutputStream(output);

        int ch = 0;
        byte[] bs = new byte[1024];
        while((ch = binput.read(bs))!=-1){
            boutput.write(ch);
        }
        binput.close();
        boutput.close();
        input.close();
        output.close();


    }

}
