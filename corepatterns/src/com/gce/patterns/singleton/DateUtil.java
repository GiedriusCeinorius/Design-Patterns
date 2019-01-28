package com.gce.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;
//2
    //Eager inicialization
//    private static DateUtil instance = new DateUtil();

//3
//    static block

//    static {
//        instance = new DateUtil();
//    }
//    private DateUtil() {
//
//    }

    //    1
    //synchronized o become thread safe
    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;

    }


    //Internally called by ObjectInputStream
    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
