package MethodsOverloading;

import JavaClassesAndObjects.Employee;

public class employeeMain {

    public static void main(String[] args) {


        employee E1 = new employee("Alex", 2.5, 70000);
        E1.printDetails();
        E1.update("Piyush",6.7);
        E1.printDetails();

        employee E2 = new employee("Dave", 5.6, 90000);
        E2.printDetails();
        E1.update("betty",7.6,4000);
        E1.printDetails();

    }
}
