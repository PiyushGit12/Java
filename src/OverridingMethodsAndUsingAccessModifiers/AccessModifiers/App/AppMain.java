package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.App;

public class AppMain {

    public static void main(String[] args){

        ResidentialProperty1 residentialProperty1 =new ResidentialProperty1("Harmony",2400);
        System.out.println("Residential Property1: " + residentialProperty1);

        residentialProperty1.printDetails();


    }
}
