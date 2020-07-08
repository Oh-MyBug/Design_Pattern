package com.ohmybug.singleton;

public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){};

    public static Mgr04 getInstance(){
        if (INSTANCE == null){
            synchronized (Mgr04.class){
                if (INSTANCE == null)
                    INSTANCE = new Mgr04();
            }
        }
        return INSTANCE;
    }
}
