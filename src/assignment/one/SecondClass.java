package assignment.one;

public class SecondClass {
    public void localVariable() {
        String name = "Local variable";
        System.out.println(name);
        System.out.println("Print the local variable.");

        int number = 1;
        System.out.println(number);
    }

    String instanceVariable;

    public void instanceVariableDeclaration() {
        System.out.println(instanceVariable);
        //System.out.println("Print the instance variable.");
    }

    static int studentCount;

    public SecondClass() {

    }

    public void printStaticVariableCount() {
        System.out.println(studentCount);
    }

    public void universityAcademics() {
        String academics = "The universities department is Schools and Institutes.";
        System.out.println(academics);
    }

    public static void main(String[] args) {
        SecondClass.studentCount = 100;
        SecondClass secondClass = new SecondClass();
        secondClass.instanceVariable = "Print the instance variable for the main class.";
        secondClass.instanceVariableDeclaration();
        secondClass.universityAcademics();
        secondClass.printStaticVariableCount();

    }

}
