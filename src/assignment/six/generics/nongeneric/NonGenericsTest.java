package assignment.six.generics.nongeneric;

public class NonGenericsTest {

    public static void main(String[] args) {

        Student stringTest = new Student("Fahmida");
        System.out.println(stringTest.getName() + " is a student at this university.");

        University doubleTest = new University(3.8);
        System.out.println("Fahmida's CGPA is : " + doubleTest.getResult());

        Canteen integerTest = new Canteen(2);
        System.out.println("The university has " + integerTest.getQuantity() + " canteens");
    }

}
