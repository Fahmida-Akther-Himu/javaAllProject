package assignment.two.javaPackage;

import java.util.Scanner;

public class UsePrimitiveDataTypes {

    public static void main(String[] args) {
        double i = 5.10;
        System.out.println("Print double : " + ++i + '\n');     //print double

        long l = 2;
        for (int a = 1; (l > a) && (a != l); a++) {
            System.out.println("Print long: " + l);             //print long
        }

        float f = 10.10f;
        System.out.println('\n' + "Print float: " + f + '\n');  //print float

        int testOne;
        int testTwo;

        Scanner input = new Scanner(System.in);
        testOne = Integer.parseInt(input.next());               //scanner input
        Scanner inputOne = new Scanner(System.in);
        testTwo = Integer.parseInt(inputOne.next());            //scanner input

        if (testOne == testTwo) {
            System.out.println("Test One is equal to Test Two");
            System.out.println("After comparing: Test One = " + testOne + "\t Test Two = " + testTwo);
        } else {
            System.out.println("Test One is not equal to TestTwo");
            System.out.println("After comparing: Test One = " + testOne + "\t Test Two = " + testTwo);
        }

        boolean b1 = true;
        System.out.println('\n' + "Print boolean: " + b1);      //print boolean
        boolean b2 = false;
        System.out.println("Print boolean: " + b2 + '\n');      //print boolean

        char ch = 'F';
        System.out.println("Print char: " + ch + '\n');         //print character

        byte by = 5;
        System.out.println("Print byte: " + by--);
        System.out.println("Print byte: " + by + '\n');         //print byte

        short shortOne;
        short shortTwo;
        Scanner scanner = new Scanner(System.in);
        shortOne = (short) Integer.parseInt(input.next());      //scanner input
        Scanner scannerOne = new Scanner(System.in);
        shortTwo = (short) Integer.parseInt(inputOne.next());   //scanner input

        System.out.println("Print Short One : " + shortOne);      //print short
        System.out.println("Print Short Two : " + shortTwo);      //print short

    }

}
