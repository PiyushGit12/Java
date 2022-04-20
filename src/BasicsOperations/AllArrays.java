package BasicsOperations;

import java.util.Arrays;

public class AllArrays {

    public static void main(String[] args) {

        String[] carsBrands= {"Volvo","BMW","FORD", "Mazda"};
        char[] ch ={'P','i','y','u','s','h'};
        String phrase = "  Live and let Live!  ";

        String name = new String(ch);

        System.out.println("Car Brands: "+carsBrands );

        String CarBrandsString=Arrays.toString(carsBrands);
        System.out.println("The strings of Car Brands: "+CarBrandsString );
        System.out.println("The length of Car Brands: "+carsBrands.length );

        System.out.println("\n\nThe character Array: " +ch);
        System.out.println("The String: " +name);

        System.out.println("\n\nThe length of String is: "+ phrase.length());
        System.out.println("Trim the string is: "+ phrase.trim());
        System.out.println("Convert String into Capital letter:" +phrase.toUpperCase());
        System.out.println("What is the location of first 't'? :" +phrase.indexOf('t'));
        System.out.println("What is the location of first '!'? :" +phrase.indexOf('!'));
        System.out.println("What is the location of first 'v'? :" +phrase.indexOf('v'));
        System.out.println("What is the location of first 'x'? :" +phrase.indexOf('x'));
        // indexOf() method search from the first character of the string.
        // lastIndexOf method search from th last character of the string.

        System.out.println("What is the location of last 'v'? :" +phrase.lastIndexOf('v'));
        System.out.println("What is the character at position of  3 :" +phrase.charAt(3));
        System.out.println("What is the character at position of  1 :" +phrase.charAt(1));
        System.out.println("What is the character at position of  24 :" +phrase.charAt(24));


    }
}