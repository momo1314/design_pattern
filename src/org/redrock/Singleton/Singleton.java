package org.redrock.Singleton;

public enum Singleton {
    INSTANCE;
    private Resource instance;
    Singleton(){
        instance = new Resource();
    }
    public Resource getInstance(){
        return instance;
    }
}
class Resource{
    //比如数据库连接,线程池
}