package BasicsOperations;

public class AirthematicOperations {

    public static void main(String[] args) {


        int num1=20,  num2=8,  quotient, remainder;

        int varInt1 = 10, varInt2 = 5;

//        quotient= num1 / num2;    // A division operators will produce a quotient.
//        remainder=num1 % num2;   // Modulus operator Calculate the remainder of such operations.
//
//        System.out.println("Quotient = " + quotient);
//        System.out.println("Remainder =" + remainder);
//
//        System.out.println("varInt1 = " + varInt1);
//        System.out.println("varInt2 = " + varInt2);
//
//        varInt1 +=2;   // We can also use like this {++varInt1(called Prefix); or varInt1++(Called PostFix);}
//        varInt2 -=2;   // We can also use like this (--varInt2; or varInt2--;)
//
//        System.out.println("\nvarInt1 after an increment = " + varInt1);
//        System.out.println("\nvarInt2 after an Decrement = " + varInt2);

        float varFloat1=10.5F, varFloat2=5.5F;
        long varLong1 = 10L, varLong2 = 5L;


        System.out.format("varFloat1 = %f \t varFloat2 =%f",varFloat1,varFloat2);
        System.out.format("\nvarLong1 = %d \t varLong2 =%d",varLong1,varLong2);

        varFloat1 -=3.4F;
        varFloat2 +=2.4F;

        varLong1 *= varLong2;

        System.out.println("\nAfter Updates the floats:");
        System.out.format("varFloat1 = %f \t varFloat2 =%f",varFloat1,varFloat2);

        System.out.println("\nAfter Updates the LongValues:");
        System.out.format("varLong1 = %d \t varLong2 =%d",varLong1,varLong2);


    }
}