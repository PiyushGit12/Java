package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.FinalMOdifierWithField;

public class Property {

    private String propertyType;
    private final long id;       // private final long id =  Math.round(Math.random() * 1000);  we can also initialize like this.
    private String projectName;
    private int propertySize;


//    {
//        id = Math.round(Math.random() * 1000); This is an Non-Static initialization Block.
//    }

    /* An initialization Block can be thought of as a floating bit of code includes btz a pair of curly braces within the code of java class.   */

    public Property(String propertyType, String projectName, int propertySize){

        this.id = Math.round(Math.random() * 1000);       // Final fields can be assigned to in the constructor.After all those values
                                                    //are of little use unless they've been initialized bcz after that they've been initialized, we can't change their values and that is why
                              //its perfectly OK for us to assign a value to a final variable inside a constructor.
        this.propertyType = propertyType;
        this.projectName = projectName;
        this.propertySize = propertySize;

    }

    public void setPropertyType(String propertyType){
        this.propertyType = propertyType;
    }

//    public void setId(long id){
//        this.id = id;
//        //   We cannot reassign value after the variable is marked as a Final.
//
//    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }


    @Override
    public String toString(){

        return String.format("\nProperty {propertyType=%s, id=%d, ProjectName =%s, PropertySize= %s }",
                propertyType,id,projectName,propertySize);

    }


}

/* If we mark a field as final we can't change its value after its been initialized.
* this.id = Math.round(Math.random() * 1000);   ->  In fact,if we try and delete this assignment inside the constructor,we
* encounter another compile error.Then error msg been encounter is Variable ID might not have been initialized,So not only does
* java permit the initialization of a final field in a constructor,if you eliminate it,it's going to throw a compile error unless
*  you initialize it where you declare it in the class.  */

/* We have now encounter two ways of initializing the values of a final field.One way inside the constructor,Another
* is in the class where you initialize and declare the variable.  */

/* So there are two varieties of initialization Blocks,Static initialization blocks, and instance-level initialization Blocks(Non Static ).
* Every time we attempt to construct an object of the property class,the code within this block is going to be executed even before the code in
* constructor is executed. */