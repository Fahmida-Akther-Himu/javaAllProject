package assignment.two.modifier;

public class Protected {
    public static void main(String[] args) {
        Base b = new Base();
        String name = "Test", address = "Khulna", subject = "Bangla";
        int mark = 50;

        b.base1(name, address, subject, mark);      //public method
        //b.base2(name,subject,mark);               //private method
        //b.base3(name,mark);                       //protected method
        //b.base4(name);                            //default method

    }

}
