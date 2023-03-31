package assignment.five.encapsulation;

public class Employee {
    private String name;
    private String id;
    private int salary;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee fullyEncapsulation = new Employee();
        fullyEncapsulation.setName("Fahmida");
        fullyEncapsulation.setId("1847");
        fullyEncapsulation.setSalary(20000);
        System.out.print(fullyEncapsulation.getName() + " is an employee of BRACIT.");
        System.out.println();
        System.out.println("Her employee ID is : " + fullyEncapsulation.getId());
        System.out.println("Her running salary is : " + fullyEncapsulation.getSalary() + " BDT");
    }

}
