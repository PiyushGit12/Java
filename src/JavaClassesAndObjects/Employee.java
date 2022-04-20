package JavaClassesAndObjects;

public class Employee {


        //Constructor must have the name as the class name that it's in and it does not have a return type.
       // because its always going to be returning an object of whatever class in it.

//    public int id;
//    public String name;
//    public double gpa;
//
//    public Employee(int id, String name, double gpa){
//
//        this.id = id;
//        this.name = name;
//        this.gpa = gpa;
//
//        System.out.println("Constructor object with id: " +id + "this: "+this);


        //This Keyword can be used from inside code in any class in order to refer to the current object at any point in time.


    //  **************************************************************************************************    //

    private String name = "";
    private double experience = 0.0;
    private double salary = 0.0;

    public Employee(String name, double experience, double salary){

        this.name = name;
        this.experience = experience;
        this.salary = salary;

    }

    public void printDetails(){

        System.out.println("\n*** In printDetails()");

        System.out.println("Name:" + name + "\tYears of experience:" + experience + "\tSalary:" + salary);

    }

    public String getName(){
        return this.name;
    }

    public double getExperience(){
        return experience;
    }

    public double getSalary(){
        return salary;
    }

    // Setter method is used to set the New Value to our current object.

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // If you want to change the state of your fields from inside your class the best way to do this by using the setters.
    // and likewise if you want to access the value of your state even from inside your class the best way to do this by using the getters
    // Bcz by using the setter ans getter you maintain the abstraction provided by those methods.
    // and its a recommended practice


    public void update(String name, double experience, double salary){

        setName(name);
        setSalary(salary);
    }

}
