package Interfaces;

public class Sedan1 extends  ConceptCar{

    public Double price;

    public Sedan1(String make,String model,double price){
        super(make,model);

        this.price = price;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getReleaseDate(){
        return Automobile.getFormattedCalenderString();
    }
    /* We have directly invoke the Static method from the Automobile interface,Automobile.getFormattedCalenderString
    * This shows that is possible for the static methods define inside an interface to be access from anywhere just like
    * any other static methods. */

    @Override
    public String toString(){
        return String.format("Make: %s, Model: %s, Price: %s",getMake(),getModel(),price);
    }


}
