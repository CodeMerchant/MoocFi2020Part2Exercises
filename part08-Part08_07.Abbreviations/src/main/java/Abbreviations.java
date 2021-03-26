
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String name = sanitizeString(abbreviation);

        if (this.abbreviations.containsKey(name)) {
            System.out.println("already exists");
        } else {
            this.abbreviations.put(name, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        String name = sanitizeString(abbreviation);

        return this.abbreviations.containsKey(name);
    }

    public String findExplanationFor(String abbreviation) {
        String name = sanitizeString(abbreviation);

        if (!(this.abbreviations.containsKey(name))) {
            return null;
        }

        return this.abbreviations.get(name);
    }

    public static String sanitizeString(String text) {
        if (text == null) {
            return "";
        }

        text = text.toLowerCase();
        return text.trim();
    }
}
