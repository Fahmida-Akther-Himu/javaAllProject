package assignment.six.interfaceOne;

public class Square implements Printable {
    public int width = 100;
    public int perimeter = 0;

    public int printPerimeter() {
        perimeter = width * 4;
        System.out.println("Print the formula of the perimeter : perimeter = width * 4");
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println(printPerimeter());
        System.out.println();
        System.out.println("Perimeter of square is : " + printPerimeter() + " meters");
        System.out.println("Draw and print a square.");
    }

}
