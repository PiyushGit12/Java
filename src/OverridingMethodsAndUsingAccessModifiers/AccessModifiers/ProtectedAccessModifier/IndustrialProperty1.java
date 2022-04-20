package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.ProtectedAccessModifier;

public class IndustrialProperty1 extends Property1{

    public IndustrialProperty1(String projectName,int propertySize)
    {
        super("Industrial Property",projectName,propertySize);
    }

    public void printDetails(){

        System.out.println(String.format("Property Type: %s,project Name: %s ,Property Size in Sqft: %s",
                propertyType,getProjectName(),getPropertySize()));
    }

    public void printDetailsFormattedString(){
        System.out.println("Access the getFormattedString() method from base class which is Protected:" +getFormattedString());
    }


}

/* The printDetails method access various protected methods and fields of the base class.This include propertyType,getProjectName(),getPropertySize().
* all of which had been marked as protected in the property1 Base class.The IndustrialProperty1 class extends Property1 and that's why
* all of these attempts to access protected functionality are perfectly fine.
* HowEver there is another reason why these attempts are fine,and that's bcz IndustrialProperty1 And Property1 reside in the same package.*/