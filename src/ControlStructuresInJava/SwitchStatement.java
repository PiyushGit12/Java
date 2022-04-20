package ControlStructuresInJava;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the dayIndex: ");

        int dayIndex = Input.nextInt();

        switch(dayIndex){

//            case 1:
//                System.out.println("Day: Sunday");
//            case 2:
//                System.out.println("Day: Monday");
//            case 3:
//                System.out.println("Day: Tuesday");
//            case 4:
//                System.out.println("Day: Wednesday");
//            case 5:
//                System.out.println("Day: Thursday");
//            case 6:
//                System.out.println("Day: Friday");
//            case 7:
//                System.out.println("Day: Saturday");

                // if i enter 5 ,It will execute the remaining below conditions as well ,means 6,7 will also execute.
                // so that will use break statement.

            case 1:
                System.out.println("Day: Sunday");
                break;
            case 2:
                System.out.println("Day: Monday");
                break;
            case 3:
                System.out.println("Day: Tuesday");
                break;
            case 4:
                System.out.println("Day: Wednesday");
                break;
            case 5:
                System.out.println("Day: Thursday");
                break;
            case 6:
                System.out.println("Day: Friday");
                break;
            case 7:
                System.out.println("Day: Saturday");
                break;

            default:
                System.out.println("Only the value 1-7 are permitted. Try Again!!");
           // One little flaws in that if i enter thar 7 value it will not print anything to the console.
           // So for that we use Handler called "Default" which will handle the Else block, if value is more than the use case.


        }

    }
}
