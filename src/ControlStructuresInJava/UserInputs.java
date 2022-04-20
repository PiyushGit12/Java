package ControlStructuresInJava;

import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args){

        System.out.println("Enter The Value here: ");

        Scanner Input = new Scanner(System.in);

//        int temperature = Input.nextInt();
//        System.out.println("The Input Temperature is: " + temperature);
//
//        float decivalue = Input.nextFloat();
//        System.out.println("The Float value  is: " + decivalue);

//        String name = Input.next();      // Also we can use nextLine() for taking all the full string.
        String name = Input.nextLine();
        System.out.println("The String value  is: " + name);




    }
}
