package cn.xh.demo05;

import java.io.*;

public class DWriter {

    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("s1.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        String str = null;
////        while(str = bufferedWriter.)
//        bufferedWriter.write("hello");
//        bufferedWriter.newLine();
//        bufferedWriter.write("world");
//        bufferedWriter.close();

        FileReader fileReader = new FileReader("s1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str = null;
        while((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }

        bufferedReader.close();
    }

}
