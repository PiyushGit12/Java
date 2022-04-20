package InheritanceAndInterfaces;

public class Book extends Object {     //This is the base class

    private String bindingType = "PaperBack";       // When the base class has the field that's been marked as public,that field is also going to be available for
                                                    // use through all object of their derived class.

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void CheckOutBook(){

        System.out.println("The book has been checked out SuccessFully");

    }

}
