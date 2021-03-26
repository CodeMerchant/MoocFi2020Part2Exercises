
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "I");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    /**
     * Method that prints out JUST the keys
     *
     * @param hashmap A HashMap object that will be passed to retrieve it's key
     */
    public static void printKeys(HashMap<String, String> hashmap) {

        for (String printKey : hashmap.keySet()) {
            System.out.println(printKey);
        }

    }

    /**
     * Method that allows us to search and print a specific key based off string
     * thats passed to the method
     *
     * @param hashmap A HashMap object that will be passed to retrieve it's key
     * @param text String that gets passed to the method for checking
     */
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        String sanitised = sanitizeString(text);
        for (String printWhere : hashmap.keySet()) {
            if (!printWhere.contains(sanitised)) {
                continue;
            }
            System.out.println(printWhere);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        String textKey = sanitizeString(text);
        /* Using an ArrayList, what we were taught prior to this exercise
        
        ArrayList<String> list = new ArrayList<>();
        for (String string : hashmap.keySet()) {
            if (!string.contains(textKey)) {
                continue;
            }

            list.add(hashmap.get(string));
        }
        for (String listAll : list) {
            System.out.println(listAll);
        }
         */

        //another way of doing it. Less code and possibly more faster. Courtesy of Cardo Uustal @cardouken on GitHub
        for (Map.Entry<String, String> values : hashmap.entrySet()) {
            if (values.getKey().contains(textKey)) {
                System.out.println(values.getValue());
            }
        }

    }

    public static String sanitizeString(String text) {
        if (text == null) {
            return "";
        }

        text = text.toLowerCase();
        return text.trim();
    }
}
