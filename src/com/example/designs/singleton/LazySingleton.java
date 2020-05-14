package com.example.designs.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    /*  Without volatile modifier, it’s possible for another thread in Java to see
        half initialized state of sSoleInstance variable, but with volatile variable
        guaranteeing happens-before relationship, all the write will happen on volatile
        INSTANCE before any read of sSoleInstance variable

    */

    private static volatile LazySingleton INSTANCE = null;


    // private constructor
    private LazySingleton() {
      /*
          To prevent Singleton failure while due to reflection you have
           to throw a run-time exception in constructor,
           if the constructor is already initialized and some class
           to initialize it again.
      */


        //Prevent form the reflection api.
        /* if (INSTANCE != null) {
           throw new RuntimeException("Use getInstance() method to get the single instance of this class.");

         }*/
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                //double-checked locking.
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }


    protected Object readResolve() {
        return INSTANCE;
    }


    //Make singleton from serialize and deserialize operation.

}
