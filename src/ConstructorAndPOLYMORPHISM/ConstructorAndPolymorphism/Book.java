package ConstructorAndPOLYMORPHISM.ConstructorAndPolymorphism;

public class Book {

    private String name = "Unknown";

    public Book(){

        System.out.println("Book: Default no-Argument Constructor");
    }
    public Book(String name){

        this.name = name;
        System.out.println("Book: Parameterized Constructor");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkOut(){
        System.out.format("The Book: %s has been CheckOut SuccessFully!", name);

    }


    @Override
    public String toString(){

        return String.format("Name: %s ", name);
    }

}
