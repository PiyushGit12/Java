package MethodsOverloading;

/* using Default Constructor
  These are special methods which help to create an object and bring it into life by assigning memory and also assigning
   values to fields and the state of the object.
   public class Car { }
  At this point our class already implicitly extends Java.lang.Object
   this is implicit we don't need to make it any more explicit
   Java has provided us with a default no argument constructor which will be used in order to create objects of the car class.

/* So the default no argument constructor is going to assign independent memory locations for the object that's being
    constructed     */

public class Car {

    private String name;
    private String type;
    private float mpg;
    private int price;


    public Car(){
//        name= "Honda Accord";
//        type = "Hatchback";
//        mpg = 22.5f;
//        price = 25000;
//
//        System.out.println("Object Constructed");

    }

    // NOTE:This is Parameterized Constructor, it hides the default no-argument Constructor
    public Car(String carName){

        System.out.println("Parameterized Constructor:" + this);
        name = carName;
    }

    public Car(String type,String name){

        System.out.println("Parameterized Constructor:" + this);
        this.type = type;
        this.name = name;
    }

    public Car(String carName,String carType, float carMpg, int carPrice){

        System.out.println("Parameterized Constructor:" + this);
        name = carName;
        type = carType;
        mpg = carMpg;
        price = carPrice;
    }



    // This is one type of Helper method.
    public void printCarInfo(){

        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n",name,type,mpg,price);

    }


}

