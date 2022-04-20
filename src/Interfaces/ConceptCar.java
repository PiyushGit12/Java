package Interfaces;

// Lets see how it's possible for an Abstract class to implement an interface..

public abstract class ConceptCar implements Automobile {

    private String make;
    private String model;


    public ConceptCar(String make, String model){
        this.make  = make;
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    // This Method is not implemented for ConceptCar
    @Override
    public abstract double getPrice();

    // This Method is not implemented for ConceptCar
    // It was a default method in the interface but we have made it abstract once again.
    // This means that this *Has* to be implemented by the derived class.
    @Override
    public abstract String getReleaseDate();

}
