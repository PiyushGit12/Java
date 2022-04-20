package CallByValueAndCallByReference;

public class productMain {

    public static void main(String[] args) {

        Product phone = new Product(1234,"iPhone6s", 6000, "Mobile and Accessories");

        Product anotherPhone = new Product(1234,"iPhone6s", 6000, "Mobile and Accessories");


        System.out.println("Phone:" +phone);
        System.out.println("AnotherPhone:" +anotherPhone);

        System.out.println("*************************");

        System.out.println("phone == anotherPhone: " + (phone == anotherPhone));
        System.out.println("phone == .equals(anotherPhone): " + (phone.equals(anotherPhone)));

       /* Double equals operator and .equals() in java is always going to compare objects based on their memory locations. */


        Product phoneCopy = phone;              // Shallow copies
        Product anotherPhoneCopy = anotherPhone;


        System.out.println("\n**Phone.equals(phoneCopy) is true so hashCodes equal");
        System.out.println("phone.hashcode():" + phone.hashCode());
        System.out.println("phoneCopy.hashcode():" + phoneCopy.hashCode());


        System.out.println("\n**anotherPhoneCopy.equals(anotherPhoneCopy) is true so hashCodes equal");
        System.out.println("anotherPhone.hashcode():" + anotherPhone.hashCode());
        System.out.println("anotherPhoneCopy.hashcode():" + anotherPhoneCopy.hashCode());


        // If two objects evaluate to true when comparing using .equals, then their hashcode must be equal


    }
}
