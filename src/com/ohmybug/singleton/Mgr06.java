package com.ohmybug.singleton;

public class Mgr06 {
    private Mgr06(){}

    private static class Mgr06Holder {
        private static final Mgr06 INSTANCE = new Mgr06();
    }

    public static Mgr06 getInstance(){
        return Mgr06Holder.INSTANCE;
    }
}
