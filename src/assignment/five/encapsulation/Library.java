package assignment.five.encapsulation;

public class Library {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int setArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Library writeEncapsulation = new Library();
        writeEncapsulation.setLength(10);
        writeEncapsulation.setWidth(11);
        System.out.println("The area of the library will be " + writeEncapsulation.setArea() + " meters.");
    }

}
