package com.ohmybug.singleton;

public class Mgr05 {
    private static volatile Mgr05 INSTANCE;

    private Mgr05(){}

    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            synchronized (Mgr05.class){
                if (INSTANCE == null)
                    INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
}
