package Interfaces;

// Lets understand the concept of Interface hierarchy.


public interface SportsCar{

    String getMake();
    /* Common method in Automobile and SportsCar interface and must be implements only once in which class(Lamborghini)
    that's implement those classes.*/

    float getToSpeed();


}











/*1- Now remember that in the context of classes,inheritance is used to imply " IS A RELATIONSHIPS".So if you have a base class,
*   any class which extends that class shares an IS A relationship with that base class.This is true with interface as well.
*
* 2- Here SportsCar extends Automobile and so every instance of sportCar also has an IS A relationship with Automobile.And this in turn means that if
*    any concrete class sets out to implement the SportCar interface,not only does it have to implement all of the methods in sportCar,
*    it also has to implement all of the methods in the Automobile.
* 3- Please remember that one interface must extends another.
*
* 4-  */