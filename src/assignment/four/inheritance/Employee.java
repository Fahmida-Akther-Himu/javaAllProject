package assignment.four.inheritance;

public class Employee extends University {
    public String employeeName = "Professor Md. Shorif Uddin";

    public Employee() {
        super();
    }

    public void payInformathion() {
        System.out.println("Employee name is : " + employeeName);
        String salary = "50000";
        System.out.println("His salary was : " + salary + " BDT");
        System.out.println("This employee has spent the last five years at this university.");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.payInformathion();
        employee.print();
    }

}
