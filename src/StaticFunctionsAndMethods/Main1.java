package StaticFunctionsAndMethods;

public class Main1 {

    public static void main(String[] args) {


        Cookies c1 = new Cookies("abc12","Alice","ali@011",2);
        System.out.println("\n(C1):" + c1);
        System.out.println("(Cookie type (C1):" + c1.getCookieType_PRT());

        Cookies c2 = new Cookies("abc22","Bobby","bob@022",3);
        System.out.println("\n(C2):" + c2.toString());
        System.out.println("(Cookie type (C2):" + c2.getCookieType_PRT());

        Cookies c3 = new Cookies("abc33","jetty","jett@033",4);
        System.out.println("\n(C3):" + c3.toString());
        System.out.println("(Cookie type (C3):" + c3.getCookieType_PRT());

        /*Accessing the Private Static variables through getter and setter methods.    */

        System.out.println("\n********* Update cookie type on one object");
        c1.setCookieType_PRT("LOGGED_OUT_USER_COOKIE_PVT");
        // We can only set the values by "class reference object" in private static variable.

        System.out.println("\nCookie Type (C1):" +c1.getCookieType_PRT());
        System.out.println("\nCookie Type (C2):" +c2.getCookieType_PRT());
        System.out.println("\nCookie Type (C3):" +c3.getCookieType_PRT());


        Cookies.setCookieType_PRT("LOGGED_OUT_USER_COOKIE_PVT_THROUGH_STATIC CLASS_REFERENCE");
        System.out.println("\n Updated cookie using static class reference:" + Cookies.getCookieType_PRT());

        /* We can only set the values by "class reference object" not through the class name.
           So if you want to access  static variables methods through class name, you have to make the methods Static.
           So if you have a static methods, it's fine for us to access them via object reference
           So its a good practice of invoking static methods using the class reference rather than the object reference.. */

//        Cookies.getCookieType_PRT();
//        Cookies.setCookieType_PRT("f3f");
    }
}
