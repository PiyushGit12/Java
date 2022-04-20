package StaticFunctionsAndMethods;

public class CookieMain2 {

    public static void main(String[] args) {

//        Cookie2 c1 = new Cookie2("abc12","Alice","ali@011",2);
//        System.out.println("\n( Cookie2 (C1) ):" + c1);
//        System.out.println("Number of cookies created:" +Cookie2.getCookieCount());
//
//        Cookie2 c2 = new Cookie2("abc22","Bobby","bob@022",3);
//        System.out.println("\n( Cookie2 (C2) ):" + c2);
//        System.out.println("Number of cookies created:" +Cookie2.getCookieCount());
//
//        Cookie2 c3 = new Cookie2("abc33","jetty","jett@033",4);
//        System.out.println("\n( Cookie2 (C3) ):" + c3);
//        System.out.println("Number of cookies created:" +Cookie2.getCookieCount());
//
//        for(int i=0;i<10;i++ )
//        {
//            new Cookie2("222", "SomeUser", "SU1234", 6);
//        }
//
//        System.out.println("\nNumber of cookies created (After for loop):"+ Cookie2.getCookieCount());



        /* Using a static filed to generate a Unique ID for every object of the cookie2 class.*/


      // This is for UniqueIDGenerator Code   //

        Cookie2 c1 = new Cookie2("abc12","Alice","ali@011",2);
        System.out.println("\n( Cookie2 (C1) ):" + c1);

        Cookie2 c2 = new Cookie2("abc22","Bobby","bob@022",3);
        System.out.println("\n( Cookie2 (C2) ):" + c2);

        Cookie2 c3 = new Cookie2("abc33","jetty","jett@033",4);
        System.out.println("\n( Cookie2 (C3) ):" + c3);

        /* Now we are successfully used a static field to generate a unique ID for every object of the class. */


    }
}
