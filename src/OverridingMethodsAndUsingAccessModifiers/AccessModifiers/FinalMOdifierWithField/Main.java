package OverridingMethodsAndUsingAccessModifiers.AccessModifiers.FinalMOdifierWithField;

public class Main {

    public static void main(String[] args) {

        Property alpha =new Property("Residential Property","Alpha",1200);
        Property beta =new Property("Commercial Property","Beta",3000);
        Property gamma =new Property("Industrial Property","Gamma",100000);
        Property delta =new Property("Plot","Delta",1600);


        System.out.println("alpha: "+ alpha);
        System.out.println("beta: "+ beta);
        System.out.println("gamma: "+ gamma);
        System.out.println("delta: "+ delta);


        System.out.println("************************ USING THE FINAL MODIFIER WITH METHODS AND CLASSES.");

        ResidentialProperty2 residentialProperty = new ResidentialProperty2("Acme",2400);
        CommercialProperty2 commercialProperty =new CommercialProperty2("Bliss",4000);

        System.out.println("residential Property: "+ residentialProperty);
        System.out.println("commercial Property: "+ commercialProperty);

    }
}
