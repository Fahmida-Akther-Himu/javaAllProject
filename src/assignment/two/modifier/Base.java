package assignment.two.modifier;

public class Base {
    public void base1(String name, String address, String subject, int mark) {
        System.out.println("Name : " + name + "\n" + "Address : " + address + "\n" + "Subject : " + subject + "\n" + "Mark : " + mark + "\n");

    }

    private void base2(String name, String subject, int mark) {
        System.out.println("Name : " + name + "\n" + "Subject : " + subject + "\n" + "Mark : " + mark + "\n");
    }

    protected void base3(String name, int mark) {
        System.out.println("Name : " + name + "\n" + "Mark : " + mark + "\n");
    }

    void base4(String name) {
        System.out.println("Name : " + name);

    }

}
