package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
       /* dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        
        dictionary.delete("apina");
        dictionary.delete("banana");
        
        
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("ohjelmointi"));
        */
        boolean wasSuccessful = dictionary.load();
        
        if(wasSuccessful){
            System.out.println("Successfully loaded file");
        }
        
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        
        
        dictionary.add("steez", "style");
        dictionary.add("link", "meet");
        dictionary.save();
        
      SaveableDictionary s = new SaveableDictionary(); 
      s.add("apina", "monkey"); 
      s.add("tietokone", "computer"); 
      s.add("apina", "apfe"); 
        System.out.println(s.translate("apina"));
    }
    
}
