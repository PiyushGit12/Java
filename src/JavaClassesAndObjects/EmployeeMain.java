package JavaClassesAndObjects;

public class EmployeeMain {
    public static void main(String[] args) {


//        Employee E1 = new Employee(234, "Piyush", 3.4);
//
//        System.out.println("An object of the class Employee (E1): "+ E1);
//        System.out.println("E1 ID:" +  E1.id +  "\tE1 name:"  +  E1.name +  "\tE1 Gpa:"+ E1.gpa);
//
//
//        Employee E2 = new Employee(675, "Sonkar", 5.6);
//
//        System.out.println("\nAn object of the class Employee (E2): "+ E2);
//        System.out.println("E1 ID:" +  E2.id +  "\tE1 name:"  +  E2.name +  "\tE1 Gpa:"+ E2.gpa);


   //  **************************************************************************************************    //


        Employee E1 = new Employee("Alex", 2.5, 70000);
//        E1.printDetails();
//        E1.setName("Piyush");
        System.out.println("Name (E1):" + E1.getName());

        Employee E2 = new Employee("Betty", 5, 120000);
//        E2.printDetails();
        System.out.println("Experience (E2):" + E2.getExperience());

        Employee E3 = new Employee("carol", 3, 90000);
//        E3.printDetails();
        System.out.println("Salary (E3):" + E3.getSalary());

        System.out.println("\n\n");

        Employee E4 = new Employee("Ashu", 4, 50000);
        E4.setName("Piyush");
        E4.setSalary(60000);
        E4.printDetails();


        System.out.println("Invoke E5 Object");

        Employee E5 = new Employee("salman", 7, 100000);
        E5.printDetails();
        System.out.println("** After Update");

        E5.update("Sharukh",2,4000);
        E5.printDetails();


    }



}