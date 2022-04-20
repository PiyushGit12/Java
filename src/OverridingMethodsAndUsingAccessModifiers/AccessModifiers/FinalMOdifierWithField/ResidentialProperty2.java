package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.FinalMOdifierWithField;

public class ResidentialProperty2 extends Property2{

    public ResidentialProperty2(String projectName,int propertySize){
        super("Residential Property2",projectName,propertySize);

    }

//    @Override
//    public String toString(){
//
//        return "Residential Property2 !";
//    }
    /* You cannot Override this method bcz its marked as Final in base class and it
     now cannot be overridden by any derived class.  */




}
