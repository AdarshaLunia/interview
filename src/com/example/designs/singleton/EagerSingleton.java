package com.example.designs.singleton;

public class EagerSingleton {

    private static EagerSingleton INSTANCE;
    private String info = "Initial class info";

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EagerSingleton();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
