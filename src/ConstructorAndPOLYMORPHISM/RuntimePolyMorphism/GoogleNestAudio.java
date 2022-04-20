package ConstructorAndPOLYMORPHISM.RuntimePolyMorphism;

public class GoogleNestAudio extends  SmartSpeakers{

    public GoogleNestAudio(){
        super("Google Nest Audio");
    }

    @Override
    public void wakePhrase(){
        System.out.println("Wake Phrase: Okay Google");
    }

}
