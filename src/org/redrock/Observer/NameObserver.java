package org.redrock.Observer;

public class NameObserver implements Observer {
    @Override
    public void update(Subject o, Object arg) {
        if (arg instanceof String) {
            // 产品名称改变值在name中
            String name = (String) arg;
            System.out.println("名称观察者:" + o + "物品名称已经改变为: " + name);
        }
    }
}
