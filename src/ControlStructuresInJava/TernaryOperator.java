package ControlStructuresInJava;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        System.out.println("Enter The Value here: ");

        Scanner tempInput = new Scanner(System.in);
        int temperature = tempInput.nextInt();
        tempInput.close();


        System.out.println("Temperature is : " + temperature);

        String result = (temperature >=84) ? "Hot" : "not so hot ";
        System.out.println("The weather today is :" +result);





    }
}
