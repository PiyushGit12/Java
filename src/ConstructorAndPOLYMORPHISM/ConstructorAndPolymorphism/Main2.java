package ConstructorAndPOLYMORPHISM.ConstructorAndPolymorphism;

public class Main2 {

    public static void main(String[] args) {

        Book2 HeadfirstJava1 = new Book2();
        System.out.println("HeadfirstJava:" +HeadfirstJava1);

        System.out.println();

        Book2 effectiveJava = new Book2("effectiveJava");
        System.out.println("effectiveJava:" +effectiveJava);

        System.out.println();

        Book2 coreJava = new Book2("coreJava","Cay s.Horst");
        System.out.println("coreJava:" +coreJava);

        System.out.println();

        SelfHelpBook2  algorithmToLive = new SelfHelpBook2();
        System.out.println("algorithmToLive:" +algorithmToLive);

        /* In the above that two constructor have been invoked.The default no-argument constructor of the book2 class and then the
        * default no-argument constructor of the SelfHelpBook2 class. */

        System.out.println();

        SelfHelpBook2  twoAwesomeHours = new SelfHelpBook2("twoAwesomeHours");
        System.out.println("twoAwesomeHours:" +twoAwesomeHours);

        System.out.println();

        SelfHelpBook2  thePowerOfHabit = new SelfHelpBook2("The Power Of Habit","Charles clark",450);
        System.out.println("thePowerOfHabit:" +thePowerOfHabit);

        System.out.println();

/* As always the base class constructor executes before the derived class constructor,  */


    }

}

/* Book2(String name)
Book2(String name,String Author)
SelfHelpBook2(String name,String author,int numberOfPages)
thePowerOfHabit:Name: The Power Of Habit, Author: Charles clark

 Starting from the bottom the last of the  three was the derived class Constructor for selfHelpBook2,Which took in a name,Author
 and numberOfPages.that in turn used the SUPER keyword to invoke the two argument constructor of the Book2 class {super(name,author);}
 which took in the name and the Author {Book2(String name,String Author)}.
 But then we had our constructor chaining and that caused the two argument constructor of the Book2 class to invoke the one
 argument constructor{this.numberOfPages = numberOfPages;} of the Book2 class using this Keyword.and that is why we have the third constructor invoked.{Book2(String name)}
  This is the Book2 class constructor which only takes in the name.*/
