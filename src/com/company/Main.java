package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User us=new User();
        us.levl=999;

        //Запись в объект
        FileOutputStream fos = new FileOutputStream("mySave");      // создание файла
        ObjectOutputStream Oos =new ObjectOutputStream(fos);    // создание объекта
        Oos.writeObject(us);    //запись
        Oos.close();    // закрытие

        //чтение в переменную
        FileInputStream fis = new FileInputStream("mySave"); // чтение файла
        ObjectInputStream Ois =new ObjectInputStream(fis);
        User us2 = (User)Ois.readObject(); // присвоение
        Ois.close(); //закритие потока

        System.out.println(us2.levl);
    }
}
