package MethodsOverloading;

public class employee {

    private String name = "";
    private double experience = 0.0;
    private double salary = 0.0;

    public employee(String name, double experience, double salary) {

        this.name = name;
        this.experience = experience;
        this.salary = salary;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setExperience(double experience){
        this.experience = experience;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void printDetails(){

        System.out.println("\n*** In printDetails()");

        System.out.println("Name:" + name + "\tYears of experience:" + experience + "\tSalary:" + salary);

    }

    // Note: This is private bcz you do not want external entities to invoke this method
    // directly, external classes should only call update.

    private void saveToDatabase(){
        System.out.format("Saving to database ...(%s, %.2f, %.2f)\n", name, experience, salary);

    }


    public void update(String name, double experience){

        System.out.println("Update (String name), ( Double experience) Invoked");
        setName(name);
        setExperience(experience);
        saveToDatabase();


    }
    public void update(String name, double experience,double salary){

        System.out.println("Update (String name), ( Double experience), (Double Salary) invoked");
        setName(name);
        setExperience(experience);
        setSalary(salary);
        saveToDatabase();

    }

}
