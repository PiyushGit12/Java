package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.AbstractClasses;

public class OnePlus extends Phone{

    private boolean stylusSupport;

    public OnePlus(float basePrice, boolean stylusSupport)
    {
        super("Android","OnePlus",basePrice);
        this.stylusSupport = stylusSupport;
    }

    @Override
    public double computeTotalPrice() {
        return getBasePrice() + getBasePrice() * 0.10;
    }

    @Override
    public String toString(){
        String superString = super.toString();
        return String.format("%s, stylusSupport: %s",superString,stylusSupport);
        /* It uses super.toString() in order to construct the base class string representation.   */

    }

}

/* There we had a derived class OnePlus which extends an abstract class phone.Now the abstract class phone has an abstract method
* called computeTotalPrice.HowEver,the derived class OnePlus does not implement this method,and its also not marked as abstract,  */