package assignment.three.jumpStatements;

public class JumpStatements {
    public static void main(String[] args) {
        //Java break statement
        int summation = 0;
        for (int a = 1; a < 10; a++) {
            if (a == 5) break;                  //hard break
            summation = summation + a;
            System.out.println("Total count will be : " + summation);

        }
        System.out.println();
        //Java continue statement
        for (int a = 3; a < 9; a++) {
            if (a == 5) continue;               //skip
            System.out.println(a);

        }
    }

}
