package StaticFunctionsAndMethods;

public class Main {

    public static void main(String[] args) {


        Cookies c1 = new Cookies("abc12","Alice","ali@011",2);
        System.out.println("\n(C1):" + c1);
        System.out.println("(Cookie type (C1):" + c1.cookieType);

        Cookies c2 = new Cookies("abc22","Bobby","bob@022",3);
        System.out.println("\n(C2):" + c2.toString());
        System.out.println("(Cookie type (C2):" + c2.cookieType);

        Cookies c3 = new Cookies("abc33","jetty","jett@033",4);
        System.out.println("\n(C3):" + c3.toString());
        System.out.println("(Cookie type (C3):" + c3.cookieType);


        c1.cookieType = "LOGGED_IN_USER_COOKIE";


        System.out.println("\nCookie Type (C1):" +c1.cookieType);
        System.out.println("\nCookie Type (C2):" +c2.cookieType);
        System.out.println("\nCookie Type (C3):" +c3.cookieType);

        /* This little experiment has proven that a static field is indeed shared by all of the objects
           of the particular class. Example: We change the value of that static field via one object reference
           and we saw for ourselves that is also changed when accessed via the other object references.  */


        System.out.println("\n Static variable can be accessed using the class:" + Cookies.cookieType);
        // This is the correct way to accessing the Static variable.


        Cookies.cookieType = "LOGGED_IN_USER_COOKIE_WITH_CLASS";
        // Through the class reference we can get the same output.

        System.out.println("\n*********************************");
        System.out.println("Updated Static variable through class References:" +Cookies.cookieType);
        System.out.println("\n*********************************");

        System.out.println("\nCookie Type (C1):" +c1.cookieType);
        System.out.println("\nCookie Type (C2):" +c2.cookieType);
        System.out.println("\nCookie Type (C3):" +c3.cookieType);


    }


    /* You should know that Final can also be used to modify class as well as methods.
       If a class has been marked as a final, it cannot be extended which means that no other classes can derive
       from that class.
       And similarly  If a method has been marked as a final, that it cannot be overridden.    */


}
