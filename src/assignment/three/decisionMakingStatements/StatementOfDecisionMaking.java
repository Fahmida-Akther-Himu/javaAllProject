package assignment.three.decisionMakingStatements;

import java.util.Objects;
import java.util.Scanner;

public class StatementOfDecisionMaking {
    public static void main(String[] args) {
        //Simple if statement
        int age;

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter name : " + "\n");
        String name = inputName.next();

        Scanner inputAge = new Scanner(System.in);             //scanner input
        System.out.println("Enter age : " + "\n");
        age = Integer.parseInt(inputAge.next());

        if (Objects.equals(name, "Himu")) {
            age++;
            System.out.println("Next year, her age will be : " + age);
        }

        //if-else statement
        int february;

        Scanner input = new Scanner(System.in);             //scanner input
        february = Integer.parseInt(input.next());

        if (february > 28) {
            System.out.println("This year is Leap Year." + "\n");
        } else {
            System.out.println("This year is not Leap Year." + "\n");
        }

        //if-else-if ladder
        int year, presentYear, nextYear, lastYear;
        Scanner inputYear = new Scanner(System.in);             //scanner input
        year = Integer.parseInt(input.next());
        presentYear = Integer.parseInt(input.next());
        nextYear = Integer.parseInt(input.next());
        lastYear = Integer.parseInt(input.next());

        if (year != presentYear) {
            System.out.println("This is not present year." + "\n");
        } else if (nextYear > presentYear) {
            System.out.println("Next year is coming after this year." + "\n");
        } else if (year == lastYear) {
            System.out.println("Last year has gone." + "\n");
        } else {
            System.out.println("Year is not found" + "\n");
        }

        //Nested if-statement
        if (Objects.equals(name, "Fahmida")) {
            if (age == 25) {
                System.out.println("This is Fahmida" + "\n");
            } else {
                System.out.println("This is not Fahmida" + "\n");
            }
        } else {
            System.out.println("Not found anyone. " + "\n");
        }
    }

}
