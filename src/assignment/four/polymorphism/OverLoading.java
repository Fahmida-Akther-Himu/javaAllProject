package assignment.four.polymorphism;

public class OverLoading {
    public void summation(int firstNumber, int secondNumber) {
        double count = firstNumber + secondNumber;
        System.out.println("Summation is : " + count);
    }

    public void summation(int firstNumber, int secondNumber, int thirdNumber) {
        double count = firstNumber + secondNumber+thirdNumber;
        System.out.println("Summation is : " + count);
    }

    public static void main(String[] args) {
        OverLoading addition = new OverLoading();
        addition.summation(10,5);
        addition.summation(10,2,4);
    }

}
