package OverridingMethodsAndUsingAccessModifiers.OverridingMethodsInDerivedClass;

public class CommercialProperty extends Property{

    public enum Type{
        OFFICE,
        RETAIL,
        INDUSTRIAL
    }

    private Type commercialPropertyType = Type.OFFICE;
    private float contractedServicesFees;

    public CommercialProperty(String projectName,int propertySize, Type commercialPropertyType,float contractedServicesFees){

        super("Commercial",projectName,propertySize);
        this.commercialPropertyType = commercialPropertyType;
        this.contractedServicesFees = contractedServicesFees;

    }
    public static String getPropertyType(){
        return "Commercial";
    }


    @Override
    public void printDetails() {
        System.out.format("commercialProperty {Type = %s, Contracted Services Fees=%.1f}"
                ,commercialPropertyType,contractedServicesFees );
        System.out.println();
    }

}
