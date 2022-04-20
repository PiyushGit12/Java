package JavaClassesAndObjects;

import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        String someString = new String("Hello String classes!");    // Constructor with  arguments
        System.out.println("Some String "+ someString);

        String anotherString = new String("Another object of type String!!");
        System.out.println("Another String "+ anotherString);

        Date someDate = new Date();                 // Constructor with no arguments { Default Constructor }
        System.out.println("\nSome Date "+ someDate);

        Date anotherDate = new Date();
        System.out.println("Another Date "+ anotherDate);

        /* Every Java Object has a Built in method called toString  and the toString method in every class knows how to
        * correctly display objects of that class and this is done via a common base class , In Java every object belongs
        * to a class which inherit from a common baseclass.java.lang.Object and this toString method is defined in java.lang.Object
        * and overridden by all of the other classes.
         So By anytime we see the "new" keyword followed by the name of a class, a constructor is being Invoked. */


        Random someRandom = new Random();
        System.out.println("\nSome Random:" + someRandom);

        // Output is { java.util.Random@14ae5a5 } So by default it Start with class name and @ simbol and after that
        // is a hexadecimal  memory location where this particular object resides on the java Heap memory.

        Object someObject = new Object();
        System.out.println("\nSome Object:" +someObject);


        Main main1 =new Main();
        System.out.println("InheritanceAndInterfaces.Main 1:" +main1.toString());
        System.out.println("InheritanceAndInterfaces.Main 1:" +main1.getClass());

        // So we have Variable which is of type InheritanceAndInterfaces.Main with the uppercase M, the variable name mai1 and its instantiated
        // to hold on object of class InheritanceAndInterfaces.Main. we'll do this using new keyword and followed by  the name of our class.

        Main main2 =new Main();
        System.out.println("InheritanceAndInterfaces.Main 2:" +main2.getClass());


        // .toString and .getClass in both Built-in and User defined classes in java.


    }
}
