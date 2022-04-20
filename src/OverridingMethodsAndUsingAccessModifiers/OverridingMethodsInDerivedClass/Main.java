package OverridingMethodsAndUsingAccessModifiers.OverridingMethodsInDerivedClass;

public class Main {
    
    public static void main(String[] args) {

        ResidentialProperty alpha = new ResidentialProperty("Alpha", 1200,
                ResidentialProperty.Type.TOWNHOME, 400);
        ResidentialProperty beta = new ResidentialProperty("Beta", 900,
                ResidentialProperty.Type.CONDO, 3000);

        alpha.printDetails();
        beta.printDetails();

        System.out.println();

        CommercialProperty gamma = new CommercialProperty("Gamma", 3000,
                CommercialProperty.Type.OFFICE, 7000);
        CommercialProperty delta = new CommercialProperty("Delta", 10000,
                CommercialProperty.Type.RETAIL, 15000);

        gamma.printDetails();
        delta.printDetails();

        System.out.println();

        Property epsilon = new Property("Plot", "Epsilon", 1600);
        epsilon.printDetails();

        System.out.println();



        /* Now our end goal is to understand how hiding works in the context of static functions with an inheritance hierarchy.
         * Before that let's again run through dynamic method dispatch,so its requires us to setup runtime polymorphism by overriding
         * methods in our derives classes. So for that we have overridden the "printDetails"  method in CommercialProperty class and
         * ResidentialProperty class. */

        /* So we Saw how overridden methods gets invoked even when we do not have runtime polymorphism,and that's bcz in such situations when we have
         * variables which are of derived class type,there is no ambiguity at all about which versions needs to be invoked.
         * Its always going to be the derived class version.  */

        /* if we invoke a method which is defined in the base class "printDetails" but then overridden in the derived class.Java is going to invoke
         * the overridden derived class version.*/

        /* Now we are going to use the Super Keyword which we only used so far with constructors,but which can also be used with any overridden method.
         */


        System.out.println("*****************Method Hiding for static methods with the same name");

        System.out.println("Property.getPropertyType(): "+ Property.getPropertyType());
        System.out.println("ResidentialProperty.getPropertyType(): "+ ResidentialProperty.getPropertyType());
        System.out.println("CommercialProperty.getPropertyType(): "+ CommercialProperty.getPropertyType());

        /* Remember that when accessing static methods,the recommended way of doing this is using class reference and not an object reference. */



    }
}