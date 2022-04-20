package Interfaces;

 // Lets understand the concept of Interface herirachy.
 // This class is going to implements the SportCar interface.

public class Lamborghini implements SportsCar,Automobile {

    private String make;
    private String model;
    private double price;

    private float topSpeed;

    public Lamborghini(String model,double price,float topSpeed){

        this.make ="Lamborghini";

        this.model = model;
        this.price = price;

        this.topSpeed = topSpeed;
    }



    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public float getToSpeed() {
        return topSpeed;
    }

    @Override
    public String toString(){

        return String.format("Make: %s, Model: %s, Price: %s,Top Speed:" , make,model,price,topSpeed);
    }


}


/* 1- public class Lamborghini implements SportsCar,Automobile{ }. SportCar and Automobile are completely independent interfaces.
*  So just as Lamborghini needs to implement every method in the automobile interface,it also needs to implements every method
*  in the SportsCar interface.
*
* 2- If we have a class(Lamborghini) which implements two interfaces,and if both those interfaces have some method in common,
*    then that class only needs to implement that method once.
*    */