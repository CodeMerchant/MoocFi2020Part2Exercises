
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "Make it make sense was how it started..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "Pride is a killer of pure souls..."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for(Book books : hashmap.values()){
            System.out.println(books);
        }
        
        
        /*
        This code works but is longer
        
        String textKey = "";
        textKey = sanitizeString(textKey);

        ArrayList<Book> list = new ArrayList<>();
        for (String string : hashmap.keySet()) {
            if (!string.contains(textKey)) {
                continue;
            }

            list.add(hashmap.get(string));
        }
        for (Book listAll : list) {
            System.out.println(listAll.toString());
        }
        */

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
      
        for (Book book : hashmap.values()) {
            if (book.getName().contains(sanitizeString(text))) {
                System.out.println(book);
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
