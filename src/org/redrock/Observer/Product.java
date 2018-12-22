package org.redrock.Observer;

public class Product extends Subject {

    // 定义两个属性
    private String name;
    private double price;

    public Product() {
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    // 当程序调用name的setter方法来修改Product的name属性时
    // 程序自然触发该对象上注册的所有观察者
    public void setName(String name) {
        this.name = name;
        notifyObservers(name);
    }

    // 当程序调用price的setter方法来修改Product的price属性时
    // 程序自然触发该对象上注册的所有观察者
    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }
}
