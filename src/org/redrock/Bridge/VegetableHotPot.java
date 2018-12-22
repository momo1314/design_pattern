package org.redrock.Bridge;

public class VegetableHotPot extends AbstractHotPot {
    public VegetableHotPot(Taste style){super(style);}

    @Override
    public void eat() {
        System.out.println("这是一份放满蔬菜的,带着"+super.style.style()+"的火锅");
    }
}
