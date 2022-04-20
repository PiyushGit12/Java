package ConstructorAndPOLYMORPHISM.RuntimePolyMorphism;

public class SmartSpeakers {

    private String productName = "unknown";

    public SmartSpeakers(String productName){

        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void wakePhrase(){
        System.out.format("Activates on saying %s's wake phrase.\n",productName);
    }

    public void printDetails(){
        System.out.println("SmartSpeaker class: " +getProductName());
    }


}
