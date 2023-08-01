package xyz.gauravsharma.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        exampleSerialization();
       // exampleReflection();
    }
    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(singleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        Singleton deserializedSingleton = (Singleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + singleton.hashCode());
        System.out.println("Object 2 :" + deserializedSingleton.hashCode());

    }
    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        //Knowing only one constructor taking it using index
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        Singleton singleton = (Singleton) constructor.newInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println("Reflected hashcode singleton :"+singleton.hashCode());
        System.out.println("Singleton instance : "+ instance.hashCode());
    }
}