package InheritanceAndInterfaces;

public class NonFrictionBook extends Book{    //This is the Derived class

    private String Subject = "Evolution/History";

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public void display(){

        System.out.println("Type: Non-Friction");

    }



}
