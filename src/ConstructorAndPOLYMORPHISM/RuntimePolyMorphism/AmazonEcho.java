package ConstructorAndPOLYMORPHISM.RuntimePolyMorphism;

public class AmazonEcho extends SmartSpeakers{


    public AmazonEcho(){
        super("Amazon Echo"); // We use Super keyword in order to invoke the base class constructor,that's base
                                         // class constructor needs to be given a productName.
    }

    @Override                      //Doing so has some Advantages.
    public void wakePhrase(){
        System.out.println("wake phrase: Alexa");

    }

    /* For One it improves the readability of the code and make it clear to the reader of the code which methods are Overridden.
    * For Another it also adds a compiler check.When we add the @Override annotations,the compiler  will check to see if there is
    * indeed a base class method with the same signature that's being Overridden.If not it display a warning.    */


}
