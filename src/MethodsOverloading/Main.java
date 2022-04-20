package MethodsOverloading;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println("(C1):" + c1);
//        System.out.println("Name:" + c1.name);
//        System.out.println("Type:" + c1.type);
//        System.out.println("MpG:" + c1.mpg);
//        System.out.println("Price:" + c1.price);

        c1.printCarInfo();


        Car c2 = new Car();
        System.out.println("\n(C2):" + c2);
        c2.printCarInfo();


        Car c3 = new Car("Toyota Corolla ");
        System.out.println("\n(C3):" + c3);
        c3.printCarInfo();

        Car c4 = new Car("Mini XUV","TATA Nexon");
        System.out.println("\n(C4):" + c4);
        c4.printCarInfo();


        Car c5 = new Car("Honda city ", "Hatchback", 24.5f,126000);
        System.out.println("\n(C5):" + c5);
        c5.printCarInfo();





    }
}
