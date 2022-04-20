package BasicsOperations;

public class LogicalOperators {

    public static void main(String[] args) {

      boolean isJavaFun = true;
      boolean isCoffeeBitter = true;
      boolean isTheSkyPurple = false;
      boolean isTheEarthFlat = false;

      // The OR Operator
        System.out.println("(isJavaFun || isCoffeeBitter):" + (isJavaFun || isCoffeeBitter));
        System.out.println("(isJavaFun || isTheSkyPurple):" + (isJavaFun || isTheSkyPurple));
        System.out.println("(isTheEarthFlat || isCoffeeBitter):" + (isTheEarthFlat || isCoffeeBitter));
        System.out.println("(isTheSkyPurple || isTheEarthFlat):" + (isTheSkyPurple || isTheEarthFlat));

        /* In OR Operator We only need One operator to evaluate true.If all values is false only then
           it evaluate False.    */

        System.out.println("\n\n(isJavaFun || isTheSkyPurple || isTheEarthFlat):"
                + (isJavaFun || isTheSkyPurple || isTheEarthFlat ));
        System.out.println("(isJavaFun || isCoffeeBitter || isTheEarthFlat || isTheSkyPurple):"
                + (isJavaFun || isCoffeeBitter || isTheEarthFlat ||  isTheSkyPurple ));

        System.out.println("(isTheSkyPurple || isTheEarthFlat || False ):"
                + (isTheSkyPurple || isTheEarthFlat || false));


        // The AND Operator
        /*   In AND Operators Each and Every operands needs to be True for the final result.
        */

        System.out.println("\n(isJavaFun && isCoffeeBitter):" + (isJavaFun && isCoffeeBitter));
        System.out.println("(isJavaFun && isTheSkyPurple):" + (isJavaFun && isTheSkyPurple));
        System.out.println("(isTheEarthFlat && isCoffeeBitter):" + (isTheEarthFlat && isCoffeeBitter));
        System.out.println("(isTheSkyPurple && isTheEarthFlat):" + (isTheSkyPurple && isTheEarthFlat));






    }
}
