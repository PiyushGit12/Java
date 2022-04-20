package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.PrivateAccessModifier;

public class IndustrialProperty extends Property{

    public IndustrialProperty(String projectName,int propertySize)
    {
        super("Industrial Property",projectName,propertySize);
    }

    public void printDetails(){

        System.out.println(String.format("Property Type: %s, Property Size in Sqft: %s",
                propertyType,getPropertySize()));
    }

}
/* As we can see in printDetails method we have accessed the Field propertyType as well the method getPropertySize.
* Both of these access are only allowed in the derived class bcz these fields mark as public,we shall see that it would also
* have been fine to access  any fields that have been marked as Protected.  */