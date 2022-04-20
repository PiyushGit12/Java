package ConstructorAndPOLYMORPHISM.RuntimePolyMorphism;

public class Main {

    public static void main(String[] args) {


        SmartSpeakers smartSpeaker = new SmartSpeakers("Google Nest");
        AmazonEcho amazonEcho = new AmazonEcho();
        AppleHomePad appleHomePad = new AppleHomePad();

        System.out.println("smartSpeaker Name: " + smartSpeaker.getProductName());
        System.out.println("amazonEcho Name: " + amazonEcho.getProductName());
        System.out.println("appleHomePad Name: " + appleHomePad.getProductName());

        System.out.println("****************************************************************************************");

        SmartSpeakers googleNestAudio =new GoogleNestAudio();
        SmartSpeakers amazonEcho1 =new AmazonEcho();
        SmartSpeakers appleHomePad1 =new AppleHomePad();
        SmartSpeakers sonosOne = new SonosOne();

        System.out.println("googleNestAudio Name: " + googleNestAudio.getProductName());
        System.out.println("amazonEcho1 Name: " + amazonEcho1.getProductName());
        System.out.println("appleHomePad1 Name: " + appleHomePad1.getProductName());
        System.out.println("sonosOne Name: " + sonosOne.getProductName());

        System.out.println();

        googleNestAudio.wakePhrase();
        amazonEcho1.wakePhrase();
        appleHomePad1.wakePhrase();
        /* we can see that in above output the invocation of wakePhrase methods have all resulted in the derived class implementations
         being invoked.  */
        sonosOne.wakePhrase();
        // In this case we had not overridden the wake Phrase method.that's why we can see here that it's the base class version
       // that's been implemented.

        /* This really is a RuntimePolymorphism in action.*/
        /* Any of the derived classes could choose to simply not override the functionality from the base class,and then that functionality will
        * automatically get picked up at runtime."DYNAMIC METHOD DISPATCH" is smart enough to figure out that is there is no version of
        * of the WakePhrase method available in a particular derived class,it just has to go up the inheritance hierarchy until
        * it finds a version that's exactly what's happened here.*/




    }
}
