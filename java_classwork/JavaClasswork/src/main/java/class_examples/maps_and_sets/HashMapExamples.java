package class_examples.maps_and_sets;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Map<String,String> stringMap = new HashMap<>();

        // places keys and values
        stringMap.put("key", "value");
        stringMap.put("key2", "value2");
        stringMap.put(null, "actual value");
        stringMap.put("null value", null);
        stringMap.put("null value 1", null);

        // maps can have null as value many times, but can only have null as single key

        // this is adding null a 2nd time which will overwrite the existing valus
        stringMap.put(null, "actual value 1234");

        //it will overwrite a non null key as well
        stringMap.put("key", "value 1234");

        String value = stringMap.get("key");
        System.out.println(value);

        // common way of looping over a map
        for (String key : stringMap.keySet()) { //loops over all keys
            System.out.println(key + "=" + stringMap.get(key)); //prints out each value
        }
    }
}
