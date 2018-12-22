package org.redrock.Bridge;

public abstract class AbstractHotPot {
    protected Taste style;

    public AbstractHotPot(Taste style){this.style = style;}

    public abstract void eat();
}
