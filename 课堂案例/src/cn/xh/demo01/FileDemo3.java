package cn.xh.demo01;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\ricky\\IdeaProjects\\零基础学JAVA学习专题\\极简JAVA五IO流\\课堂案例\\test");
//        Boolean b = file.createNewFile();
//        Boolean b1 = file.createNewFile()
//        System.out.println(b);

//        System.out.println(file.delete());

        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

//        System.out.println(file.list());
        String[] fs = file.list();
        for (String f : fs) {
            System.out.println(f);
        }

        File[] fs2 = file.listFiles();
        for (File file1 : fs2) {
            System.out.println(file1);
        }

    }

}
