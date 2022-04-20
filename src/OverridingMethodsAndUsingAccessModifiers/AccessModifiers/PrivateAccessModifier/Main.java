package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.PrivateAccessModifier;

public class Main {

    public static void main(String[] args){

        Property property =new Property("Residential","Alpha",1200);

        System.out.println("Property: "+ property);
        System.out.println("Property toString() (Public): " +property.toString());

        property.setPropertySize(2400);
        System.out.println("\nProperty Size in  sqft: " +property.getPropertySize());

        System.out.println("\nProperty Type: " +property.propertyType);

//        System.out.println("\nProperty ProjectName (Private): " +property.projectName());
        // You cannot access the private field and methods outside the class.

//        System.out.println("\nProperty Formatted String (Private): " +property.getFormattedString());



        IndustrialProperty industrialProperty =new IndustrialProperty("Acme",15000);

        System.out.println("Industrial Property: " +industrialProperty);
        industrialProperty.printDetails();



    }
}
