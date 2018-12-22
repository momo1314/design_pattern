package org.redrock.Singleton;

/**
 * 饿汉式
 */
public class SingleObject {
    private static SingleObject myobject = new SingleObject();

    private SingleObject(){}

    public static SingleObject getMyobject(){
        return myobject;
    }

    public void Show(){
        System.out.println("This is a test");
    }
}
