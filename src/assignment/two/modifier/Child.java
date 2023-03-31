package assignment.two.modifier;

public class Child extends  Base{
    private final String name;
    private final String address;
    private final String subject;
    public int mark;

    public Child(String name, String address, String subject, int mark) {
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.mark = mark;
    }

    public static void main(String[] args) {
        Child c1 = new Child("Rupantika", "Dhaka", "English", 70);
        Child c2 = new Child("Afra", "Cumilla", "Bangla", 80);
        Child c3 = new Child("Taqwa", "Sylhet", "Physics", 90);
        Child c4 = new Child("Fahmida", "Rajshahi", "Math", 100);

        Base b1 = new Base();

        b1.base1(c1.name, c1.address, c1.subject, c1.mark);         //public method
        //b1.base2(c2.name,c2.subject,c2.mark);                     //private method
        b1.base3(c3.name, c3.mark);                                 //protected method
        b1.base4(c4.name);                                          //default method
    }

}
