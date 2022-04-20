package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.App;

import OverridingMethodsAndUsingAccessModifiers.AccessModifiers.ProtectedAccessModifier.Property1;

public class ResidentialProperty1 extends Property1 {

    public ResidentialProperty1(String projectName,int propertySize){
        super("Residential Property2",projectName,propertySize);

    }

    public void printDetails(){

        System.out.println(String.format("Property Type: %s,project Name: %s ,Property Size in Sqft: %s",
                propertyType,getProjectName(),getPropertySize()));
    }


}

/* Now we have not encounter any error in "printDetails" for access the protected elements and methods that's bcz this
* class ResidentialProperty1 extends the property1 class from ProtectedAccessModifier package.
*
* So we see from this that if we have some protected functionality,that functionality is available to any class that extends our class,whether
* or not it's in the same package.  */