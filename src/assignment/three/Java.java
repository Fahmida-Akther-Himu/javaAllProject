package assignment.three;

public class Java {
    public String month;
    public int year, day;

    public Java() {

    }

    public Java(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void day() {
        System.out.println("Today is sunny day. ");
    }

    public void month(String month) {
        this.month = month;
        System.out.println(month);
    }

    public void year() {
        int totalMonth = 12;
        System.out.println("One year is total : " + totalMonth + " months");
    }

    public void month1(String month) {
        System.out.println("March comes before April.");
    }

    public static void main(String[] args) {
        Java java = new Java();
        java.day = 7;
        java.day();
        java.month("April");
        java.year();
        java.month1("March");
    }
}
