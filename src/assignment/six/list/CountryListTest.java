package assignment.six.list;

import java.util.ArrayList;
import java.util.List;

public class CountryListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bangladesh");
        list.add(1, "India");
        list.add("Canada");
        list.add(" ");
        System.out.println(list);
        System.out.println();

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        list.add(4, "Australia");
        System.out.println(list);
        System.out.println();

        list.set(3, "USA");
        System.out.println(list);
        System.out.println();

        list.remove("India");
        list.remove(0);
        System.out.println(list);
        System.out.println();

        System.out.println(list.contains("Bangladesh"));

        if (list.contains("Bangladesh")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        list.add("Canada");
        System.out.println();

        //for each loop
        for (String x : list) {

            System.out.println(x);
        }
    }

}
