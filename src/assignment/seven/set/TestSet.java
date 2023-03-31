package assignment.seven.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Himu");
        set.add("Rifat");
        set.add("Fahmida");
        set.add("Akter");
        System.out.println(set);                //print set

        System.out.println(set.hashCode());     //print random hashcode

        set.remove("Fahmida");               //remove
        System.out.println(set);                //print set after remove


        for (String x : set)                    //for each loop and print set
        {
            System.out.println(x);
        }

        System.out.println("=================");

        Set<String> set1 = new TreeSet<>();     //Tree Set

        set1.add("Himu");
        set1.add("Fahmida");
        set1.add("Akter");
        set1.add("Rifat");
        set1.add("Zabin");
        System.out.println(set1);

        if (set1.contains("Fahmida"))           //set contains checking by using if-else
        {
            System.out.println("Absent");
        } else {
            System.out.println("Present");
        }

    }

}

