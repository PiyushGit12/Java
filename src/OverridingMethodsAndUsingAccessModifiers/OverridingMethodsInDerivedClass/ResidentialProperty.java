package OverridingMethodsAndUsingAccessModifiers.OverridingMethodsInDerivedClass;

public class ResidentialProperty extends Property{

    public enum Type{
        SINGLE_FAMILY_HOME,
        CONDO,
        TOWNHOME
    }

    private Type residentialPropertyType = Type.CONDO;
    private float hoaFees;

    public ResidentialProperty(String projectName, int propertySize,Type residentialPropertyType,float hoaFees){

        super("Residential",projectName,propertySize);
        this.residentialPropertyType = residentialPropertyType;
        this.hoaFees = hoaFees;

    }
    public static String getPropertyType(){
        return "Residential";
    }


    @Override
    public void printDetails() {
        super.printDetails();
        System.out.format("ResidentialProperty {Type = %s, HOA Fees=%.1f}"
                , residentialPropertyType, hoaFees);
        System.out.println();
    }
}

/* The printDetails method also overrides the base class implementation,but the first line makes use of the super Keyword.
*  On line 16 we used the super keyword as if it was a function or a method that we invoke,passing in input arguments.
* But i line 24 we use Super as if it's an object receiver like that this keyword.So we use Super keyword as a receiver in order to invoke the printDetails method form the base class.   */

/* If we do decide to use the super keyword,it must be the first line of the derived class constructor.
* On the Other hand,in any other method,we can use the super keyword to invoke any method of the base class,and we can do so on any line.
* These Differences btw using the super keyword in a constructor and using it in any other method.
* As these expl show the super keyword can be used in order to achieve code reuse,not just in a constructor,but in any other method.  */