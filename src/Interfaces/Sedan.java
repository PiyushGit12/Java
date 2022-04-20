package Interfaces;

public class Sedan implements Automobile {

    private String make;
    private String model;
    private double price;


    public Sedan(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;

    }


    @Override
    public String getMake() {
        return make;
    }
    /* Every method is Annotated with @Override fo each of these,so this means that we don't only use this annotations
    * While Overriding methods from a concrete base class.we also use it when implementing methods from an interface.   */

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }
    /* Every method in the interface must have the access modifier public associated with every one of the interface methods.*/

    @Override
    public String toString(){
        return String.format("Make: %s, Model: %s,Price: %s ",
                make,model,price);
    }

}




/* This class is implements the interface Automobile and that in turn introduces us to the use of this keyword "implements".
*  However,if you have a class which is implementing all of the methods from an interface,then you have got to use the
*  "Implements" keyword.
*
* THIS DIFFERENCE IS IMPORTANCE ONE
*
*    Java does not allow multiple inheritance of state,So you cannot use the extends keyword with two class names
*    on the right of the extends keyword,But it does allow multiple inheritance of interfaces.So you can have one class
* which implements more than one interface.
*
**/

/* 1-When a class claims to implement an interface,it must implement every method in the interface,and what's more the implementing
*    class must have the access modifier public associated with every one of the interface methods.
* 2- None of the other access modifier private,protected or default will suffice.   */