package com.gce.patterns.abstractFactory;

public class DBDeptDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Departmen to DB");
    }
}
