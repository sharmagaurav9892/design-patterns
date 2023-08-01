package xyz.gauravsharma.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton singleton;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(singleton== null) {
            synchronized (Singleton.class) {
                if(singleton==null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;

    }

    // Will not break singleton on serialization.
    protected Object readResolve() {
        return singleton;
    }


}
