package InheritanceAndInterfaces;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Object ob1 = new Object();
        //Created Object by using new keyword and invoking the constructor of the object class.

        System.out.println("String Representation :" +ob1.toString());
        System.out.println("Object class :" +ob1.getClass());
        System.out.println("Object Hashcode :" +ob1.hashCode());

        Object anotherObject = new Object();

        System.out.println("String Representation of anotherObject :" +anotherObject.toString());
        System.out.println("Are they equal?:"+ ob1.equals(anotherObject));

        Object objectCopy = ob1;  // we simply set objectCopy to point to the same  object

        System.out.println("\nString Representation of copy:" +objectCopy.toString()+ "\n");
        System.out.println("Is the copy equal to the original?:"+ ob1.equals(objectCopy));


        String string = new String("A String");

        System.out.println("\nString Representation :" +string.toString());
        System.out.println("class :" +string.getClass());
        System.out.println("Hashcode :" +string.hashCode());

        String anotherString = new String("A String");

        System.out.println("String Representation of anotherString :" +anotherString.toString());
        System.out.println("Are they equal?:"+ string.equals(anotherString)); // They same bcz they contain same string not same memory locations.

        // The string Representation of the string class just printed out whatever string that object held.

        Date date =new Date("3/9/2022");

        System.out.println("\nDate Representation :" +date.toString());
        System.out.println("class :" +date.getClass());
        System.out.println("Hashcode :" +date.hashCode());


        Date anotherDate =new Date("3/8/2022");

        System.out.println("\nDate Representation :" +anotherDate.toString());
        System.out.println("Are they equal?:"+ date.equals(anotherDate)); //it check whether they are actually hold the same date information.







        // The string Representation of the date class has a wealth of info. and not all of that info.was even passed
        // via the constructor.
        /* And Both of the toString() methods in these two classes differ significantly from the base class implementation
        * in java.lang.Object, Which simple printed out class name, followed by memory location of the object.
         So we can see yet again how the derived class, which here is java.lang.Date can extend or change the functionality implemented
         * from the base class.
         * The .getClass() give the same implementation from java.lang.Object,java.lang.String,java.lang.Date for across all three class we used.
         In case of  java.lang.Object class .equals methods check for whether the two object occupied the same memory location.
         In case of  java.lang.String class .equals methods it check whether they are help the same string sequence.
         In case of  java.util.Date class .equals methods it check whether they are actually hold the same date information.
        *  */


        System.out.println("Instance of Operators--***********************************************************");

        Book headFirstJava = new Book();
        String string1 = new String("A String");
        Date date2 = new Date("3/14/2022");
        Object object = new Object();


        System.out.println("IS headFirstJava an Instance of Book class?: " + (headFirstJava instanceof Book));
        System.out.println("IS string1 an Instance of String class?: " + (string1 instanceof String));
        System.out.println("IS date2 an Instance of Date class?: " + (date2 instanceof Date));
        System.out.println("IS object an Instance of Object class?: " + (object instanceof Object));


        System.out.println("\nIS object an Instance of Book class?: " +(object instanceof Book));
        System.out.println("\nIS object an Instance of String class?: " +(object instanceof String));
        System.out.println("\nIS object an Instance of Date class?: " +(object instanceof Date));

        /* So in the above line Java.lang.Object is the base class, Book, String and Date are all derived classes.
          So object of the base class are not necessarily also object of the derived class.
          Every Book is an Object but not every object is a Book.
          Now in moment i said that every object of the Derived class is an object of base class. see line 95 to 97*/

        System.out.println("\nIS headFirstJava an Instance of Object class?: " +(headFirstJava instanceof Object));
        System.out.println("\nIS string1 an Instance of Object class?: " +(string1 instanceof Object));
        System.out.println("\nIS date2 an Instance of Object class?: " +(date2 instanceof Object));

        // Every java object is going to return true, If we use instanceOf along with java.lang.Object


        System.out.println("Instance of Operators with NonFrictionBook--***********************************************************");

        NonFrictionBook sapiens = new NonFrictionBook();
        NonFrictionBook onTheOriginOfSpecies = new NonFrictionBook();

        System.out.println("\nSapiens instanceOf NonFrictionBook:" + (sapiens instanceof NonFrictionBook));
        System.out.println("Sapiens instanceOf Book:" + (sapiens instanceof Book));
        System.out.println("Sapiens instanceOf Object:" + (sapiens instanceof Object));

        /* So Now, the Whole point of Inheritance is that Objects of the derived class inherit all of the Functionality
           in the base class, and this means that we should be able to invoke methods from the book class on objects of the
            NonFrictionBook class. lets try */


        System.out.println();

        System.out.println("Sapiens Binding Type:" + sapiens.getBindingType());
        sapiens.CheckOutBook();

        System.out.println("onTheOriginOfSpecies Binding Type:" + onTheOriginOfSpecies.getBindingType());
        onTheOriginOfSpecies.CheckOutBook();

        /* So this Proves that all of the functionality available in the base class,Which here is the book class,
        * is available in objects of the derived class.Here the derived class is NonFrictionBook.  */

        System.out.println("\nSapiens Classes:" + sapiens.getClass());
        System.out.println("onTheOriginOfSpecies Classes:" + onTheOriginOfSpecies.getClass());

        //This also holds true for methods which are defined in the grandparent class,which is Java.lang.Object.
        //All of those  methods are also going to be inherited by these objects.


        System.out.println("\nSapiens Subject:" + sapiens.getSubject());
        sapiens.display();
        System.out.println("onTheOriginOfSpecies Subject:" + onTheOriginOfSpecies.getSubject());
        sapiens.display();

        /* When we have Objects of a derived class,they have all of their own fields which are defined in their derived class.
        * But they also have a fields that is the member variables which are defined inside the base class.
        * So inheritance is not only  about the inheritance of methods,its also about the inheritance of state in the form of member variables. */


        /* Now we have viewed a multilevel inheritance hierarchy.we have class NonFrictionBook which extends a base class
        * called Book which in turn implicitly inherits from java.lang.object.we instantiated objects of the derived class NonFrictionBook,
        * and we were able to also access the functionality from the classes Book and Java.lang.Object.   */


//        Object myContainer = new Book();
//        System.out.println(myContainer instanceof Book); give True
//        myContainer.getBindingType();
        //        You cannot invoke method of the derived class with an object of base class type.















    }

}
