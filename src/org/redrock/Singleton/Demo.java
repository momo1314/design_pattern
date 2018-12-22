package org.redrock.Singleton;

public class Demo {
    public static void main(String[] args) {
        //SingleObject singleObject = new SingleObject();

        SingleObject myobject = SingleObject.getMyobject();
        myobject.Show();

        //Resource res = Singleton.INSTANCE.getInstance();
    }
}
