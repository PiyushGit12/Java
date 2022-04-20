package BasicsOperations;

public class DataTypes {

    public static void main(String[] args){

        boolean isJavaFun= true;
        byte numCredits= 127;   // Cannot store value above 127 and Below -128 ..only used for smaller data types.
        char myGrade= 'A';      // Define only in a single quote ''  ....
        short numCourse= -32768;      // Cannot store value above 32767 and Below -32768..
        int age= 19;
        long tuitionFees= 23586L;
        float gpa= 45.6f;
        double incomeEarned=345.567d;

        int varInt=214_546_5678;  // We can also written like this

        String name=new String("Fiona");    //Creating a new instance of a String Class
        String character= "This is a String character says \"Hello\"";   // Double Quotes "" Means this is used to enclose a  String literal..

        /*   Let's add a Backslash to the start of each double code which needs to be a part of the String
        The backslash double quote is treated as a single character in  java and java compiler recognize this as a
        double quote Which needs to be part of sting , rather than as a means to start or end a string definition
        *  */


        System.out.println("is java fun to learn :" + isJavaFun);
        System.out.println("Number of credits of the course :" + numCredits);
        System.out.println("The student's grades in the course :" + myGrade);
        System.out.println("Number of course the student has enrolled in :" + numCourse);
        System.out.println("The age of the student :" + age);
        System.out.println("Tuition fess is paid by stdent :" + tuitionFees);
        System.out.println("The student Gpa :" + gpa);
        System.out.println("Earned Income :" + incomeEarned);


        System.out.println("The int value is :" + varInt);
        System.out.println("The name is :" + name);


    }
}
