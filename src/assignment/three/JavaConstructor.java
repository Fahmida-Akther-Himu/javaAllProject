package assignment.three;

public class JavaConstructor {
    public String name, address;
    public String phoneNumber;

    public JavaConstructor() {

    }

    public JavaConstructor(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void printInformation() {
        System.out.println("My name is : " + name + "\n" + "My hometown is : " + address + "\n" + "My contact number is : " + phoneNumber + "\n");
    }

    public void printInformation1() {
        System.out.println("My name is : " + name + "\n" + "My hometown is : " + address + "\n");
    }

    public static void main(String[] args) {
        JavaConstructor javaConstructor = new JavaConstructor();
        javaConstructor.name = "Fahmida";
        javaConstructor.address = "Dhaka";
        javaConstructor.phoneNumber = "01601234567";
        javaConstructor.printInformation();

        JavaConstructor javaConstructor1 = new JavaConstructor();
        javaConstructor1.name = "Himu";
        javaConstructor1.address = "Badda";
        javaConstructor1.phoneNumber = "01810123456";
        javaConstructor1.printInformation1();

        JavaConstructor javaConstructor2 = new JavaConstructor("Affan", "Cumilla", "01919123456");
        javaConstructor2.printInformation();

        JavaConstructor javaConstructor3 = new JavaConstructor("Hasan", "Cumilla", "01919123457");
        javaConstructor3.printInformation1();
    }
}
