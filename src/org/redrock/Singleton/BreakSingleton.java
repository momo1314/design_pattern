package org.redrock.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 单例模式的反序列化漏洞
 */
public class BreakSingleton {
    public static void main(String[] args) throws Exception{

        //先根据单例模式创建对象(单例模式所以s1,s2是一样的)
        SingleObject s1=SingleObject.getMyobject();
        SingleObject s2=SingleObject.getMyobject();

        //将s1写入本地某个路径
        FileOutputStream fos=new FileOutputStream("object");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //通过Serializable输入 --序列化
        oos.writeObject(s1);
        oos.close();
        fos.close();

        //从本地某个路径读取写入的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object"));
        Singleton s3=(Singleton) ois.readObject();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);//s3是一个新对象
    }
}
