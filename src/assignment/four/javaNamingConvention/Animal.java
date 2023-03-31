package assignment.four.javaNamingConvention;

public class Animal {
    public String name = "Fahmida";
    public String height;
    public int weight;

    public void pray() {
        System.out.println(name + " prays five times a day");
    }

    public void write() {
        System.out.println(name + " is writing a letter to her mother.");
    }

    public void sing() {
        System.out.println("Some animal sing a song.");
    }

    public void run() {
        System.out.println(name + " runs one kilometer every day.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();
        animal.write();
        animal.pray();
    }

}
