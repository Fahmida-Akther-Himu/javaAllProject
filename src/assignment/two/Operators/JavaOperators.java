package assignment.two.Operators;

import java.util.Map;
import java.util.Scanner;

public class JavaOperators {

    public static void main(String[] args) {
        //Unary Operator: expr++ expr-- ++expr --expr
        int count = 1847;
        System.out.println("Unary operator - ");
        System.out.println("count++: " + count++);      //1847
        System.out.println("count--: " + count--);      //1848
        System.out.println("count: " + count);          //1847

        System.out.println("++count: " + ++count);      //1848
        System.out.println("count: " + count);          //1848
        System.out.println("--count: " + --count);      //1847
        System.out.println("count: " + count + '\n');   //1847

        double cgpa = 4.11;
        System.out.println("++cgpa: " + ++cgpa);        //5.11
        System.out.println("cgpa++: " + cgpa++);        //5.11
        System.out.println("cgpa: " + cgpa);            //6.11

        System.out.println("--cgpa: " + --cgpa);        //5.11
        System.out.println("cgpa--: " + cgpa--);        //5.11
        System.out.println("cgpa: " + cgpa);            //4.11

        //Arithmetic Operator: * / % + -
        int science = 95, math = 98, sum;
        sum = science + math;

        System.out.println('\n' + "Arithmetic Operator - ");
        System.out.println("Summation is : " + sum);

        int english = 98, bgs = 90, sub;
        sub = english - bgs;
        System.out.println("Subtraction is: " + sub);

        int multiplication1 = 8, multiplication2 = 5, multiplication;
        multiplication = multiplication1 * multiplication2;
        System.out.println("Multiplication is: " + multiplication);

        int div1 = 60, div2 = 5, division;
        division = div1 / div2;
        System.out.println("Division is: " + division);

        int mod1 = 102, mod2 = 25, modulus;
        modulus = mod1 % mod2;
        System.out.println("Modulus is: " + modulus);

        //Ternary Operator and : ? : (int min=(a<b)?a:b; )
        var value = "";
        System.out.println('\n' + "Ternary Operator - ");

        if (Math.random() > 0) {
            value = "positive";
            System.out.println(value);
        } else {
            value = "negative";
            System.out.println("Print negative value : " + value);
        }

        //Relational Operator: < > <= >= instanceof == !=
        int testOne, testTwo, testThree;

        Scanner input = new Scanner(System.in);             //scanner input
        testOne = Integer.parseInt(input.next());

        Scanner inputOne = new Scanner(System.in);
        testTwo = Integer.parseInt(inputOne.next());

        Scanner inputTwo = new Scanner(System.in);
        testThree = Integer.parseInt(inputOne.next());

        System.out.println('\n' + "Relational Operator - ");

        if (testOne > testTwo) {
            System.out.println("testOne is larger than  testTwo");
        } else if (testOne < testTwo) {
            System.out.println("testOne is not larger than  testTwo");
        } else {
            System.out.println("Condition is false");
        }
        if (testOne >= testThree) {
            System.out.println("testOne is larger than testThree || testOne is equal to testThree");
        } else if (testOne <= testTwo) {
            System.out.println("testOne is smaller than testThree || testOne is equal to testThree");
        }
        if (testTwo != testThree) {
            System.out.println("testTwo is not equal to testThree");
        } else if (testTwo == testOne) {
            System.out.println("testTwo is equal to testOne");
        } else {
            System.out.println("Not Found");
        }

        //Logical Operator: && ||
        int x, y, z;
        Scanner scanner = new Scanner(System.in);           //scanner input
        x = Integer.parseInt(input.next());

        Scanner scannerOne = new Scanner(System.in);
        y = Integer.parseInt(inputOne.next());

        Scanner scannerTwo = new Scanner(System.in);
        z = Integer.parseInt(inputOne.next());

        System.out.println('\n' + "Logical Operator - ");

        if ((x > y) && (x >= z)) {                          //apply && condition
            System.out.println("&& condition is true");
        } else if ((x == y) || (x < z)) {                   //apply || condition
            System.out.println("|| condition is ture");
        } else {
            System.out.println("Not Found");
        }

        //Assignment Operator: = += -= *= /= %=
        int a = 200, b = 30;

        System.out.println('\n' + "Assignment Operator - ");

        a += 10;
        System.out.println("Addition = " + a);

        b -= 5;
        System.out.println("Subtraction = " + b);

        b *= 4;
        System.out.println("Multiplication = " + b);

        a /= 5;
        System.out.println("Division = " + a);

        a %= 5;
        System.out.println("Modulus = " + a);

        a = 2;
        System.out.println("Equal = " + a);
    }

}
