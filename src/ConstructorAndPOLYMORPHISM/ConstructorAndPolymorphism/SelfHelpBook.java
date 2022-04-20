package ConstructorAndPOLYMORPHISM.ConstructorAndPolymorphism;

public class SelfHelpBook extends Book{

//    public SelfHelpBook(){
//        /*The super keyword is very powerful way of accessing functionality form the base classes.when you are in inside are derived class.
//        * Its invoke the base class constructor.*/
//
////        super("Self Help Book -name placeholder");
//        System.out.println("SelfHelpBook: Default no-Argument Constructor");
//
//    }

    public SelfHelpBook(String name){
        super(name);
        System.out.println("SelfHelpBook: Parameterized Constructor");

    }

    public SelfHelpBook(){

        super();
        System.out.println("SelfHelpBook()");
        /* We have a default no argument constructor. super() This invokes the base class effort no argument constructor using the super keyword.By the way,that
        * use of the super keyword isn't really required there  */

    }


}

/* We saw how the super keyword can be used from a derived class to invoke a constructor of the base class.
* Once we add the default no argument constructor in the book class,java takes care of calling it for us.we don't need to explicitly use the super keyword
* to do so any longer */

/* Java is never going to implicitly invoke a parameterized base class constructor.if we ever would like to do so.we have got to do this ourself explicitly
* Using the "super(name)" keyword  */

/* On-Line 14 we have SelfHelpBook which takes in the parameter name and it uses the super keyword in order to invoke the parameterized constructor of the base class, which is Book.
*  */

