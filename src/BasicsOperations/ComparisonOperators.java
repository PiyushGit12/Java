package BasicsOperations;

public class ComparisonOperators {

    public static void main(String[] args) {

        boolean x = true;
        boolean result = x==true;
        int a=5, b=7;


        System.out.println("X == True :" +result);
        System.out.println("X == True :" +(x==true));
        System.out.println("X == false :" +(x==false));
        System.out.println("X != false :" +(x!=false));  //Use not equal to comparison  operator.

        System.out.println("a == b :" +(a==b));
        System.out.println("a == 5 :" +(a==5));
        System.out.println("a >= 5 :" +(a>=5));
        System.out.println("a <= 5 :" +(a<=5));


        System.out.format("\nFinal A = %d \t Final B = %d ",a,b);

        // comparison operators have not changed at all when performing comparison.

        String C="Java", D = "Beverage";

        System.out.println("\n\nC.equals(\" Java\"):" +(C.equals("Java")) );
        System.out.println("C.equals(D): "+(C.equals(D)));
        System.out.println("C.equals(\" java\"):" +(C.equals("java")) );
        System.out.println("C.equalsIgnoreCase(\" java\"):" +(C.equalsIgnoreCase("java")) );
        System.out.println("!C.equalsIgnoreCase(\" java\"):" +(C.equalsIgnoreCase("java")) );


        System.out.format("\nFinal C = %s \t Final D = %s ",C,D);


    }

    /* .equals methods is inherited from java.lang,object just like the toString() method and that, in turn means that
      there is a default implementation  of .equals() method which is now being invoked, that's means you are comparing two objects based
      on whether they are reside at the same location on the java heap memory.

      Double equals operator in java is always going to compare objects based on their memory locations.
      So two objects will only evaluate to true using the Double equals to operator if they are actually references
      to the same object.That is to the same memory locations on the java heap memory.

      */

}