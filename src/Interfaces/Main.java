package Interfaces;

public class Main {

    public static void main(String[] args) {

//        Automobile automobile =new Automobile(); // Java is treating automobile as an abstract class.Specifically a pure abstract class,
        // One in which every method is abstract.


//        Sedan sedan =new Sedan("Honda","Civic",21000.0);

        // Both are fine


        Automobile sedan =new Sedan("Honda","Civic",21000.0);

        System.out.println("Sedan Make: " + sedan.getMake());
        System.out.println("Sedan Model: " + sedan.getModel());
        System.out.println("Sedan Price: " + sedan.getPrice());

        System.out.println("Sedan: " +sedan);

        System.out.println("sedan is an instanceOf sedan: " + (sedan instanceof Sedan));
        System.out.println("sedan is an instanceOf Automobile: " + (sedan instanceof Automobile));
        // sedan is also an  instanceOf Automobile ,So when an object implements an interface,if we test for that using the
        // instanceOf operator,we are going to get back the value of true.


        System.out.println("************************ Accessing member variable or field");

        Automobile honda =new Sedan("Honda","Hatchback",21000.0);
        System.out.println("Honda safety program: " +honda.safetyAssessmentProgram);

        Automobile toyota =new Sedan("Toyota","Camry",25000.0);
        System.out.println("Honda safety program: " +toyota.safetyAssessmentProgram);

        System.out.println("Automobile Safety Program: "+ Automobile.safetyAssessmentProgram);
        System.out.println("Sedan Safety Program: "+ Sedan.safetyAssessmentProgram);

        /* Now we are able to access a variable defined in an interface in many different ways,either using instance references
        * Or using the interface reference, or even using the concrete class reference for any class that implements that interface.   */

   //     Automobile.safetyAssessmentProgram = "Euro NACP";

        /* That is not allowed however,is attempting to reassign the value of this variable.
        * This proves that When you add a member variable or field into a interface,that member variable is public,static,and final. */

       System.out.println();

        System.out.println("************************ Lets understand the concept of Interface hierarchy.");

        Automobile huracan= new Lamborghini("Huracan",78000.0,320);
        Automobile aventador= new Lamborghini("Aventador",127000.0,400);
        /* We instantiate two objects both of the Lamborghini class.Both of these are stored in variables corresponding to interfaces
        *  rather than to the concrete Lamborghini class.So on line 53 we save our object in a variable of type Automobile.
        * and on line 54 we save it in a variable of type SportSCar.
        * */

        System.out.println("Huracan: " +huracan);
        System.out.println("Aventador: " +aventador);

        System.out.println("\nHuracan is an instance of Lamborghini: " + (huracan instanceof Lamborghini));
        System.out.println("Huracan is an instance of SportsCar: " + (huracan instanceof SportsCar));
        System.out.println("Huracan is an instance of Automobile: " + (huracan instanceof Automobile));

        System.out.println("\nAventador is an instance of Lamborghini: " + (aventador instanceof Lamborghini));
        System.out.println("Aventador is an instance of SportsCar: " + (huracan instanceof SportsCar));
        System.out.println("Aventador is an instance of Automobile: " + (huracan instanceof Automobile));

        /*Every one of these invocations of the instance of operator has returned TURE.We have confirmed now that every object of the
        * :Lamborghini class is an Instance of the Lamborghini class.but it also is an instanceOF the automobile interface and an instance
        * of the SportsCar interface as well.  */


        System.out.println();

        System.out.println("************************ Lets Invoke the Default implementation methods from interface..");

        Automobile ferrari= new Lamborghini("ferrari",180000.0,400);
        System.out.println("Ferrari: " +ferrari);
        System.out.println("Ferrari Release Date: " + ferrari.getReleaseDate());


        System.out.println();
        System.out.println("************************ Lets Invoke the abstract class  methods from interface..");

        Automobile sedan1 =new Sedan1("Honda","Civic",21000.0);

        System.out.println("Sedan1 Interface: "+sedan1);
        System.out.println("Sedan1 Release Date: " +sedan1.getReleaseDate());

        /* Now we have managed to implements a class,the Sedan1 class via an intermediate abstract base class,That's the conceptCar
        * Abstract base class,which in turn implemented the Automobile interface.  */




    }
}




/* 1- The whole point of interface is that you can't instantiate it directly.
 * 2- Instead what we have got to do is add a new class "Sedan" to our project which implements this Automobile interface class.
 * 3- This statement " Automobile sedan =new Sedan("Honda","Civic",21000.0); "   It shows that even through we can never directly
 *    instantiate objects of an interface type,it;s perfectly OKAY to have variables which are of an interface type.
 *
 *    The Variable called sedan is an instance of sedan class,but it's stored in a variable of the type Automobile.Not only is this allowed,
 * this is actually strongly recommended.  */