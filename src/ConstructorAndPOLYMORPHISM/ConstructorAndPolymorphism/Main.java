package ConstructorAndPOLYMORPHISM.ConstructorAndPolymorphism;

public class Main {

    public static void main(String[] args) {


        Book HeadfirstJava = new Book("HeadfirstJava");
        System.out.println("HeadfirstJava name:" +HeadfirstJava.getName());

        Book effectiveJava = new Book("effectiveJava");
        System.out.println("\neffectiveJava name:" +effectiveJava.getName());

        SelfHelpBook  algorithmToLive = new SelfHelpBook();
        System.out.println("\nalgorithmToLive name:" +algorithmToLive.getName());
        /* When we instantiate an object of SelfHelpBook that by default also invokes a constructor of the base class Book and this is the
        * Other reason why that constructor in the book class is called the default no argument constructor.Its invokes by default every time an object
        * of any derived class is instantiate.  */


        SelfHelpBook  twoAwesomeHours = new SelfHelpBook("twoAwesomeHours");
        System.out.println("\ntwoAwesomeHours name:" +twoAwesomeHours.getName());


        /*When we have a base class and derived class and when neither of those classes has any constructor defined, each time we construct an object of the
        * derived class,the default no argument constructors of both classes are being invoked.    */



    }
}