package cn.xh.demo06;

import java.io.*;

public class SerialDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("zhangsan", 111);

        FileOutputStream fileOutputStream = new FileOutputStream("template/o2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("template/o2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        System.out.println(person1.toString());
        fileInputStream.close();
        objectInputStream.close();

    }
}
