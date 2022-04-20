package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.FinalMOdifierWithField;

    /* USING THE FINAL MODIFIER WITH METHODS AND CLASSES.     */


public class Property2 {

    private final String propertyType;
    private final long id = Math.round(Math.random() * 1000);
    private final String projectName;
    private final int propertySize;

    public Property2(String propertyType,String projectName,int propertySize){
        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;

    }

    @Override
    public final String toString(){
        return String.format("\nProperty {propertyType=%s, id=%d, ProjectName =%s, PropertySize= %s }",
                propertyType,id,projectName,propertySize);

    }

}

/* A class that has been marked as final cannot be extended.
* A Method that has been marked as final cannot be overridden.
* If we marked ToString Override Method Final in the base class that's means that it now cannot be overridden by any derived class.  */
