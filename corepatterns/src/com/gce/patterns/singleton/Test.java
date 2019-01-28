package com.gce.patterns.singleton;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DateUtil dateUtil1 = DateUtil.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/com/gce/patterns/Singleton/dateUtil.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2 = null;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/com/gce/patterns/Singleton/dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);

    }
}
