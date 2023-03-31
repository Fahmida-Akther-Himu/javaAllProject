package assignment.four.inheritance;

public class Student extends Teacher {
    public String name;
    public String passingYear;
    private final String result;

    public Student(String name, String passingYear, String result) {
        this.name = name;
        this.passingYear = passingYear;
        this.result = result;
    }

    public void read() {

        System.out.println("Students study in university. ");

    }

    public void play() {
        System.out.println("Students play in university. ");

    }

    public static void main(String[] args) {
        Student student = new Student("Fahmida", "2022", "3.80");
        student.print();
        student.takeCourse();
        System.out.println("Student name is : " + student.name + "\n" + "Student's passing year was : " + student.passingYear + "\n" + "Student's result was : " + student.result);
        student.play();
    }

}
