package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.AbstractClasses;

public abstract class Phone {

    private final String  operatingSystem;
    private final String brandName;
    private final float basePrice;
   // The private variables only going to be accessible within the phone class.

    public Phone(String operatingSystem, String brandName, float basePrice){
        this.operatingSystem = operatingSystem;
        this.brandName = brandName;
        this.basePrice = basePrice;

    }

    protected float getBasePrice(){
        return basePrice;
    }
    //This method is called getBasePrice and it returns a float.
    /* When a method is marked as a protected,that means that it can only be invoked either from the class itself or other classes which
    * extends this phone base class.  */

    public abstract double computeTotalPrice();
    //That signature includes the keyword abstract.Then we don't have any implementation,we just have a semicolon right after the parentheses.
    //Which are the part of functions signature.

    @Override
    public String toString(){
        return String.format("Operating System: %s, Brand: %s, Base Price: %s ",
                operatingSystem,brandName,basePrice);
    }



}
/* An Abstract classes one that cannot be directly instantiated.The only way to instantiate such class is to extend that class
* and then instantiate the derived class.
* Abstract classes often,but not always,have abstract methods.These methods which are not implemented,they are only defined.
*
* So the Main Agenda is that anytime you would like to prevent users or other developers from directly instantiating a class,you can
* simply mark as abstract,even if it does not contain any abstract method.So an abstract base class need not contain any abstract methods.
*
* So our method "getBasePrice" will be accessible from inside the classes Iphone and Oneplus,but it will not be accessible from inside
* the Main class. */