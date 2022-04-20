package CallByValueAndCallByReference;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {

        String [] arrayOfFruits = new String[]
                {"apple","banana","Kiwi","mango"};

        System.out.println("Inside main() Before function invocation: "+ Arrays.toString(arrayOfFruits));

        updateArray(arrayOfFruits);

        System.out.println("\nInside main() After function invocation: "+ Arrays.toString(arrayOfFruits));

    }

    public static void updateArray(String[] arrayOfFruits ){

        System.out.println("\nOriginal String (Inside Function):: "+ Arrays.toString(arrayOfFruits));

        arrayOfFruits[1] = "MANGO";

        System.out.println("Array after update (Inside Function):" +Arrays.toString(arrayOfFruits) );

    }

    /* When we pass a array from a calling function into a called function.Any modification made to that array
     * inside the called function will continue to reflect in the calling function.
     * However , "reassignment" of that array in the called function will be "lossed" by the time we come back out into
     * the calling function */
}
