package org.redrock.Singleton;

/**
 * 我们见到的枚举类
 */
enum Type{
    A,B,C,D
}







/**
 * 拓展下 将 enum看做类,可以定义变量和方法
 */
enum Type1{
    A,B,C,D;

    String type = ",test";
    public void getType() {
        System.out.println("I'm Type"+type);
    }
}


/**
 * 尝试对单个"实例"A进行定制
 */
enum Type2{
    A{
        //覆盖原有方法定制A
        public void getType(){
            System.out.println("I'm A");
        }
    },B,C,D;

    String type= ",test";
    public void getType() {
        System.out.println("I'm Type"+type);
    }

}

/**
 * 尝试单例
 */
enum Type3{
    A;
    private String B;
    Type3(){B = "I'm Singleton";}
    public String getB(){
        return B;
    }

}


public class  Singleton_enum {
    public static void main(String[] args) {
//         Type1 b = Type1.B;
//         b.getType();
//         Type2 c = Type2.A;
//         c.getType();
//         Type2 d = Type2.B;
//         d.getType();
        Type3 d = Type3.A;
        d.getB();
    }
}


