package ConstructorAndPOLYMORPHISM.ConstructorAndPolymorphism;

public class Book2 {


    private String name = "Unknown";
    private String author = "Unknown";

    public Book2()
    {
        System.out.println("Book2()");
    }
    public Book2(String name){
        this.name = name;

        System.out.println("Book2(String name)");
    }
    /* We are going to wire Up the two argument constructor to simply invoke the one argument Constructor.So in line no.23
    * there we have made use of the THIS Keyword as if it were a function.And we have passed in the value of the name as an input
    * argument.This has the effect of chaining constructor calls,so when we encounter this "this(name);" line Java is actually
    * going to invoke the other constructor that you see defined on line 13 "public Book2(String name)" and in this way
    * we've achieved some code REUSE across our constructors.
    * The similarities btw this use of THIS keyword on line "this(name);" and our use of the Super keyword in the selfHelpBook2 class
    * are very strong.  */


    public Book2(String name,String author){
//        this.name = name;
        this(name);
        this.author = author;

        System.out.println("Book2(String name,String Author)");
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

        return String.format("Name: %s, Author: %s ", name,author);
    }


}
