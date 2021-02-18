package cn.xh.demo01;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args) {
        File file = new File("Demo3.java");

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

    }



}



