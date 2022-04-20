package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.AbstractClasses;

public class Iphone extends Phone{

    private boolean airPods;

    public Iphone(float basePrice, boolean airPods)
    {
        super("IOS","Iphone 6S",basePrice);
        this.airPods = airPods;
    }

    @Override
    public double computeTotalPrice() {
        return getBasePrice() + getBasePrice() * 0.05;
    }
    // we just invoked the protected method,getBasePrice from the phone class.

    @Override
    public String toString(){
        String superString = super.toString();
        return String.format("%s, airPods: %s",superString,airPods);
        /* It uses super.toString() in order to construct the base class string representation.   */

    }
    /* So We have also actually implemented the abstract method computeTotalPrice in each of our derived classes.   */


}
