package com.example.designs.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Sandbox {

    public static void main(String a[]) {
        //Class singleton
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();


        System.out.println(eagerSingleton.getInfo()); // Initaite Class Info


        EagerSingleton eagerSingletonObj2 = EagerSingleton.getInstance();
        eagerSingleton.setInfo("Another Class Initiate");

        System.out.println(eagerSingletonObj2.getInfo());
        System.out.println(eagerSingleton.getInfo());


        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        /* We all know that in Java if the two objects are same then,
         * their hash key have to be equal
         */
        System.out.println(lazySingleton1.hashCode());
        System.out.println(lazySingleton2.hashCode());


        // Create another instance using Java Reflection API

        LazySingleton lazySingleton = null;

        try {
            Class<LazySingleton> clazz = LazySingleton.class;
            Constructor<LazySingleton> lazySingletonConstructor = clazz.getDeclaredConstructor();
            lazySingletonConstructor.setAccessible(true);
            lazySingleton = lazySingletonConstructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();

        }

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + lazySingleton1.hashCode());
        System.out.println("Instance 2 hash:" + lazySingleton.hashCode());

        /* Both the instances have a different hash code.
         * That clearly indicates
         * that Singleton class failed this test.
         *
         * To prevent Singleton failure while due to reflection you have to throw a run-time exception in constructor,
         * if the constructor is already initialized and some class to initialize it again.
         * */

        // Make Singleton thread safe

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton l1 = LazySingleton.getInstance();
                System.out.println("L1 HashCode : " + l1.hashCode());

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton l2 = LazySingleton.getInstance();
                System.out.println("L1 HashCode : " + l2.hashCode());
            }
        });


        thread1.start();
        thread2.start();


        // Make Singleton safe from Serialization

    /*  To prevent creation of another instance you have to provide the implementation of readResolve() method.
        readResolve() replaces the object read from the stream. This ensures that nobody can create another
        instance by serializing and deserializing the singleton.
     */

        try {
            LazySingleton L3 = LazySingleton.getInstance();
            ObjectOutput output = null;

            output = new ObjectOutputStream(new FileOutputStream("output.ser"));
            output.writeObject(L3);
            output.close();


            //deserialize from file to object
            ObjectInput input = new ObjectInputStream(new FileInputStream("output.ser"));
            LazySingleton L4 = (LazySingleton) input.readObject();
            input.close();

            System.out.println("Instance L3 hash:" + L3.hashCode());
            System.out.println("Instance L4 hash:" + L4.hashCode());


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
