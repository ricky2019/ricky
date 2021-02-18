package cn.xh.demo05;

import java.io.*;

public class CopyDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("s1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("o1.txt"));

        String line = null;
        while((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter. newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}


