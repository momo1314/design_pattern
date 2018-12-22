package org.redrock.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        //肉放红汤锅
        AbstractHotPot hotpot1 = new MeatHotPot(new SpicyStyle());
        hotpot1.eat();
        //肉放清汤锅
        AbstractHotPot hotPot2 = new MeatHotPot(new PlainStyle());
        hotPot2.eat();
        //菜放清汤
        AbstractHotPot hotPot3 = new VegetableHotPot(new PlainStyle());
        hotPot3.eat();
        //菜放红汤
        AbstractHotPot hotPot4 = new VegetableHotPot(new SpicyStyle());
        hotPot4.eat();
    }
}
