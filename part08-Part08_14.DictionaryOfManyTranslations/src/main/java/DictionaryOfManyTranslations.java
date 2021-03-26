
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author musa
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    /**
     * Adds the translation for the word and preserves the old translations
     *
     * @param word
     * @param translation
     */
    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());

        this.translations.get(word).add(translation);
    }

    /**
     * Returns a list of the translations added for the word. If the word has no
     * translations, the method returns an empty list
     *
     * @param word
     * @return
     */
    public ArrayList<String> translate(String word) {
        /*
        NB! please ensure that you go back to previous exercises whenever you're
        stuck. I spent a good 30 minutes trying to figure this one out before
        going back to previous exercises and finding that all I needed was this
        one line of code. :-)
         */
        return this.translations.getOrDefault(word, new ArrayList<>());

    }

    /**
     * Removes the word(i.e key) and all of its translations from the dictionary
     *
     * @param word
     */
    public void remove(String word) {
        this.translations.remove(word);
    }
}
