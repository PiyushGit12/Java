package ConstructorAndPOLYMORPHISM.ConstructorAndPolymorphism;

public class SelfHelpBook2 extends Book2{


    private int numberOfPages = -1;


    public SelfHelpBook2(){
        System.out.println("SelfHelpBook2()");
    }
    public SelfHelpBook2(String name){
        super(name);
        System.out.println("SelfHelpBook2(String name)");
    }
    public SelfHelpBook2(String name,String author,int numberOfPages){
        super(name,author);
        this.numberOfPages = numberOfPages;
        System.out.println("SelfHelpBook2(String name,String author,int numberOfPages)");
    }


    /* In a Parameterized constructor,we have to explicitly invoke the base class Parameterized constructor using the super
    * Keyword,and that needs to be on the first line of each of these derived class constructors. */

}
