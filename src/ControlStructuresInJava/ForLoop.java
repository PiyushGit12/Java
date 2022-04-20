package ControlStructuresInJava;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

//        int count = 3;
//
//        for(int i=0; i<count; i++)     // Each time the body of a loop is Executed is termed as an Iteration.
//        {
//            System.out.format("\nMessage %d: Welcome to java programming! ", i+1);
//        }


//        Scanner Input = new Scanner(System.in);
//        System.out.println("HOw many times should i repeat the message?: ");
//
//        int count = Input.nextInt();
//        for(int i=0; i<count; i++)
//        {
//            System.out.format("\nMessage %d: Welcome to java programming! ", i+1);
//        }

        String[] productName = {"Mouse","Speakers","Watch","Earphone","Charger"};
        double[] productPriceUsd = {9.90,79.0,110.0,42.50,55.0};
        double   UsdToEUR = 0.82;

        System.out.println("What are the Product prices in USD and Euros?");

        for(int i=0; i<productPriceUsd.length; i++)
        // for(int i = productPriceUsd.length-1; i>=0; i--)    we can also go from reverse order.
        {
            System.out.format("\nProduct %s costs %f USD or %f EUR",
                    productName[i],productPriceUsd[i],UsdToEUR * productPriceUsd[i]);

        }

        // One little flaws in that is,If we remove the third increment or decrement clause.This means that the value
        //of i is always 0 and is never updated, that means what we end up with is  "infinite Loop".
        // for(int i=0; i<productPriceUsd.length;) and it will print the first element array.

    }
}
