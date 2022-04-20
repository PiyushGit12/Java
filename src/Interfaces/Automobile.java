package Interfaces;

import java.util.Calendar;

public interface Automobile {

    // All methods in an interface are public and abstract by default.
    // we can omit the public modifier for interfaces.if you try specifying modifier other than public it will show an error.

    String getMake();
    String getModel();
    double getPrice();

    String safetyAssessmentProgram = "Global NCAP";  //Its a member variable or field and does not have access modifier.


    static String getFormattedCalenderString(){

        Calendar now = Calendar.getInstance();

        return String.format("%s-%s-%s ",now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH),now.get(Calendar.YEAR));
    }



    default String getReleaseDate(){          //Now added a default implementation for the method getReleaseDate.
        return getFormattedCalenderString();

    }

    /* 1- That way Any class which had previously implemented the Automobile interface before this method was added will just
    *     inherit this implementation.
    * 2- Any class which has yet to implement the Automobile interface is perfectly at Liberty to Override the getReleaseDate method.
    * 3- "default" is the modifier of the getReleaseDate and this makes it clear that if any class implements the Automobile interface.
    *    and if the class does not implement or override this particular method,the default implementation should be used.
    * 4- This Static "getFormattedCalenderString" is the helper method and what we see from this is that its possible for an interface
    *    to not only have default implementations which are going to be instance methods on classes which implements the interface.it's also possible
    *   for an interface to define static methods  */

}









/* 1-  By default everything that you declare inside an interface is public and that's why each of these methods is
*     going to be public,even through we have not used any access modifier on line 5-7.
* 2-  An interface does not contain any implementations.
* 3- The whole point of interface is that you can't instantiate it directly.
* 4- Instead what we have got to do is add a new class "Sedan" to our project which implements this Automobile interface class.
* 5- When you introduce a member variable or field into a interface,it's going to be public,static,and final.
* 6- when we add member into an interface,those can never be instance members.So they are always going to be static,and they are always
*    going to be final.of course ,in addition to being public. */
