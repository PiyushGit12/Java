package BasicsOperations;

import java.util.Arrays;

public class MyFirstProgram {
    public static int staticVar = 20;  // static  variable in java is a member of a class

    public static String name= "Piyush";

    public static void main(String[] args){

        System.out.println("The Input Arguments are :"+ Arrays.toString(args));


        String varSting= "Good Afternoon!!";
        int number=100;
        int salary=50000;

        System.out.println("This is the string variable :" +varSting);
        System.out.println("This is the static  variable :" +staticVar);
        System.out.println(name + " salary is : "+salary);
        System.out.format("The integer %d is the value of the variable:",number);
        System.out.format("The message %s has been received",varSting);
    }
}
