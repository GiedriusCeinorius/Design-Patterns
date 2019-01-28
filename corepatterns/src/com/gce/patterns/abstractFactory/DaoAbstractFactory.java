package com.gce.patterns.abstractFactory;

public abstract class DaoAbstractFactory {
    public abstract Dao createDao(String type);
}
