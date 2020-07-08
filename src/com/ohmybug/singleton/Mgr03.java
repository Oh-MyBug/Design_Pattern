package com.ohmybug.singleton;

public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {}

    public synchronized static Mgr03 getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Mgr03();
        return INSTANCE;
    }
}
