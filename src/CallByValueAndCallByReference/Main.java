package CallByValueAndCallByReference;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String word = "apple";

        System.out.print("Inside main() Before Function invocation:" +word);

        capitalizeFirstLetter(word);

        System.out.print("Inside main() After Function invocation:" +word);

    }

    public static void capitalizeFirstLetter(String word){

        System.out.print("\nOriginal String (Inside Function):" +word);

        String  firstLetter  = word.substring(0,1);
        String remainingLetters = word.substring(1);

        firstLetter = firstLetter.toUpperCase();

        word = firstLetter + remainingLetters;

        System.out.println("String after the change (Inside Function):" + word);

    }



}
