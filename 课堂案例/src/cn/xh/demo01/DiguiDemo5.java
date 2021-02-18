package cn.xh.demo01;

import java.io.File;

public class DiguiDemo5 {

    public static void main(String[] args) {
        File file = new File("/Users/ricky/Documents/Project/零基础学JAVA学习专题/极简JAVA五IO流/课堂案例");
        printFile(file);
    }

    public static void printFile(File file){
        File[] fs = file.listFiles();
//        System.out.println(fs);
        for (File f : fs) {
            if(f.isDirectory()){
                printFile(f);
            }
            else {
                System.out.println(f.getName());
            }
        }
    }

}
