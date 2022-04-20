package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.AbstractClasses;

public class Main {

    public static void main(String[] args){

        OnePlus oneplus =new OnePlus(499,true);
        Iphone iphone =new Iphone(1199,true);

//        Phone motorola =new Phone("Android","Moto G",299);
        // if we make Phone class as "Abstract class" you can't instantiate object of that class directly.

        System.out.println("One Plus: " +oneplus);
        System.out.println("iPhone: " +iphone);
//        System.out.println("Motorola: " +motorola);

        System.out.println("OnePlus Price: "+ oneplus.computeTotalPrice());
        System.out.println("Iphone Price: "+ iphone.computeTotalPrice());



    }


}
