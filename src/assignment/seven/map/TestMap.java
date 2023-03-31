package assignment.seven.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        List<String> sqaClass = new ArrayList<>();
        sqaClass.add("Class");
        sqaClass.add("Interface");
        sqaClass.add("Abstract Class");

        Map<String, Object> learning = new HashMap<>();
        learning.put("Java ", true);
        learning.put("Selenium ", false);
        learning.put("Appium ", " Yes");

        Map<String, String> objectMap = new HashMap<>();
        objectMap.put("Name ", " Fahmida");
        objectMap.put("Age ", " 25");
        objectMap.put("Learning ", String.valueOf(learning));
        objectMap.put("SqaClass ", String.valueOf(sqaClass));

        System.out.println(objectMap);

    }

}

