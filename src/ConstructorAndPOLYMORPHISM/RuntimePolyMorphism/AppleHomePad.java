package ConstructorAndPOLYMORPHISM.RuntimePolyMorphism;

public class AppleHomePad extends  SmartSpeakers{

    public AppleHomePad(){
        super("Apple Homepod");
    }

    @Override
    public void wakePhrase(){
        System.out.println("wake phrase: Hey Siri");

    }


}
