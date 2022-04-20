package OverridingMethodsAndUsingAccessModifiers.OverridingMethodsInDerivedClass;

public class Property {


    private String propertyType = "Unknown";

    private final String projectName;
    private final int projectSize;

    public Property(String propertyType, String projectName, int projectSize){
        this.propertyType = propertyType;
        this.projectName = projectName;
        this.projectSize = projectSize;

    }

    public static String getPropertyType(){
        return "Unknown";
    }

    public void printDetails(){
        System.out.format("Property {Type = %s, ProjectName = %s, projectSize = %s,}"
                ,propertyType,projectName,projectSize);
        System.out.println();
    }


}
