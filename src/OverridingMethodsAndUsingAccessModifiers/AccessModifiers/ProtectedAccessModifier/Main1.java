package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.ProtectedAccessModifier;

import OverridingMethodsAndUsingAccessModifiers.AccessModifiers.App.ResidentialProperty1;
import OverridingMethodsAndUsingAccessModifiers.AccessModifiers.PrivateAccessModifier.IndustrialProperty;

public class Main1 {

    public static void main(String[] args){

        IndustrialProperty1 industrialProperty1 =new IndustrialProperty1("Acme",15000);

        System.out.println("************Accessing protected Members from the same package");

        System.out.println("Property1 Type: " +industrialProperty1.propertyType());
        System.out.println("ID: " +industrialProperty1.getId());
        System.out.println("Project Name: " +industrialProperty1.getProjectName());
        System.out.println("Property1 Size: " +industrialProperty1.getPropertySize());
        System.out.println("Formatted String: " +industrialProperty1.getFormattedString());

/* All of these methods are marked as protected in the base class Property1 and we're only able to access them here bcz
* we are in the same package.We can't access protected elements from  outside the package unless we are subClassing the
*  base class which contains them. */

        System.out.println("*********** Now we are accessing protected Members from the Different package  ");

        ResidentialProperty1 residentialProperty1 =new ResidentialProperty1("Iris",2600);
        System.out.println("Residential Property1: " + residentialProperty1);

        residentialProperty1.printDetails();


    }

}
/* So within the package, protected is equivalent to public outside the package,protected is only going to be accessible
*  From within the derived class.  */