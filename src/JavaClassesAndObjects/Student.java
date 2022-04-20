package JavaClassesAndObjects;

public class Student {

    public static void main(String[] args){


        Student alice  = new Student();
        System.out.println("Student Object(Alice):" +alice); // So this is implicitly going to invoke the toString method

        System.out.println("Student Object(Alice):" +alice.getClass()); // Explicitly by using the syntax alice.getClass().

        Student bob  = new Student();
        Student charles  = new Student();

        System.out.println("\nStudent Object(bob):" +alice.equals(bob));
        System.out.println("Student Object(charles):" +alice.equals(charles));
        System.out.println("Student Object(Alice):" +charles.equals(alice));

        // .equals methods is simple look at the memory location of these objects, they exits in independent memory location.

    }
}
