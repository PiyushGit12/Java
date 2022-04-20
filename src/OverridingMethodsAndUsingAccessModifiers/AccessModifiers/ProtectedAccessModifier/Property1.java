package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.ProtectedAccessModifier;

public class Property1 {

    protected String propertyType;

    private String projectName;
    private int propertySize;
    private long id;

    String propertyValue;
    int propertyId;
   // Both are default access modifier.bcz they don't have any access modifier like public,private,protected.


    public Property1(String propertyType, String projectName, int propertySize) {

        this.id = Math.round(Math.random() * 1000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;

    }

    protected String propertyType() {
        return propertyType;
    }
    protected long getId() {
        return id;
    }

    protected String getProjectName() {
        return projectName;
    }

    protected int getPropertySize() {
        return propertySize;
    }




    protected String getFormattedString() {
        return String.format("\nProperty {PropertyType=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }

    @Override
    public String toString() {
        return getFormattedString();
    }

}


/*1- Protected Elements can be accessed in any subclass.When an element is marked as protected,a non subclass that is attempting to access
*     from outside the current package will not be access the Element.
*
* 2-  So if we marking the base class constructor as protected did not get in the way of that ResidentialProperty1 class which is in different package from accessing
*     it using the super keyword from derived classes which are trying to invoke this base class constructor.
* 3- It cannot be accessed from a non-subclass outside the package.
* 4-  It provides better accessibility than the default access modifier.
*
*      / protected constructor/        
*
* 3- When we have a base class constructor that's been marked as protected,it's perfectly fine for us to use that protected constructor
*    to instantiate object  directly using the new keyword,provided we do this from within the same package.But if we now attempt a
*    Similar operation from a different package,we will encounter an error.   */

         /* DEFAULT ACCESS MODIFIER   */

/* 1- If you access the default access modifier from different package which in turn means that they are Private.
*  2-  If you access the default access modifier from same package which in turn means that they are public.
*  3- The default access modifier is equivalent to public within the package,and it's equivalent to private outside the package.    */


         /* In the factory pattern or singleton pattern, what is a factory method?   */

// 1- A method that is invoked to create objects of a class that has a private constructor