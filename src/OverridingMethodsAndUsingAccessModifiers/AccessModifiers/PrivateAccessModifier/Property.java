package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.PrivateAccessModifier;

public class Property {

    public String propertyType;

    private String projectName;
    private int propertySize;
    private long id;


    public Property(String propertyType, String projectName, int propertySize) {

        this.id = Math.round(Math.random() * 1000);

        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;

    }

    public int getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }

    private String getFormattedString() {
        return String.format("\nProperty {PropertyType=%s, id=%d, projectName=%s, propertySize=%s}",
                propertyType, id, projectName, propertySize);
    }
    // This is a Private helper Method called getFormattedString and that private helper is used in our Overridden toString implementation.
    // This method is private that's bcz it's used only within the class.

    @Override
    public String toString() {
        return getFormattedString();
    }



    /* Any Fields and Methods marked as private can only be used within a class.
     * Any Fields and Methods marked as public can be used even outside the class,and even from packages other than the current packages.
     *
     * 1-When the Constructor of the class is marked as private,any attempt to directly instantiate that object using the new keyword
     *      is going to thrown an error.but we also can't invoke constructor of their classroom,any derived class.
     * 2-If you want to access the private constructor then you need to create a static method which needs to be invoked every time you need
     *     to instantiate and object of that class.    */


//    public static Property getPropertyInstance()(String propertyType, String projectName, int propertySize){
//
//        return new Property(propertyType,projectName,propertySize) ;}

        // You can invoke this method "getPropertyInstance" Using Property object and you can access the Private constructor in any outside the class and packages as well..
    //  Property property =Property.getPropertyInstance("Residential","Alpha",1200);


}