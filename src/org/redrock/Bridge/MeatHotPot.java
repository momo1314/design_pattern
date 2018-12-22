package org.redrock.Bridge;

public class MeatHotPot extends AbstractHotPot {

    public MeatHotPot(Taste style){super(style);}

    @Override
    public void eat() {
        System.out.println("这是一份放满毛肚和牛肉的,带着"+super.style.style()+"的火锅");
    }
}
