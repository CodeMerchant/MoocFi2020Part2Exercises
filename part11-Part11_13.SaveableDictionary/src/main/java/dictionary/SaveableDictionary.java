/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import java.util.Map.Entry;

/**
 *
 * @author musa
 */
public class SaveableDictionary {

    private final HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    //Part3
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    //Part1: The basic functionality.
    /**
     * Adds a word to the dictionary. Every word has JUST one translation. If
     * the same word is added for the second time, nothing happens.
     *
     * @param words
     * @param translation
     */
    public void add(String words, String translation) {

        //Was getting a FAIL: dictionary.SaveableDictionaryTest addAndTranslateAreWorking error in the Test class
        //Had to add this line
        if (dictionary.containsKey(words)) {
            return;
        }
        dictionary.put(words, translation);
        dictionary.put(translation, words);
    }

    /**
     * Returns the translation for the given word. If the word is not in the
     * dictionary, a null reference is returned.
     *
     * @param word
     * @return
     */
    public String translate(String word) {

        String translation = null;

        for (Entry<String, String> key : dictionary.entrySet()) {
            if (key.getValue().equals(word)) {
                translation = key.getKey();
            } else {
                if (key.getKey().equals(word)) {
                    translation = key.getValue();
                }

            }
        }

        return translation;
    }

    //Part2: Deleting words
    /**
     * Deletes the given word and its translation from the dictionary
     *
     * @param word
     */
    public void delete(String word) {

        dictionary.remove(word);
        dictionary.remove(translate(word));
    }

    //Part3: Reading from file
    public boolean load() {

        try {
            Files.lines(Paths.get(this.file))
                    .map(row -> row.split(":"))
                    .forEach(parts -> {
                        dictionary.put(parts[0], parts[1]);
                        dictionary.put(parts[1], parts[0]);
                    });

            return true;
        } catch (IOException ex) {
            return false;
        }

    }

    //Part4: Saving a file (handling the saving first) Had zero idea how to go about this. Putting up my hand and admitting it. I had to go to GitHub again.
    private void saveWords(PrintWriter write) {
        List<String> wordsList = new ArrayList<>();
        dictionary.keySet().stream()
                .forEach(word -> {
                    if (wordsList.contains(word)) {
                        return;
                    }

                    String wordPair = word + ":" + dictionary.get(word);
                    write.println(wordPair);

                    wordsList.add(word);
                    wordsList.add(dictionary.get(word));
                });
    }

    //Part4: Saving a file
    public boolean save() {
        try {
            try (PrintWriter writer = new PrintWriter(this.file)) {
                saveWords(writer);
                writer.close();
            }

        } catch (FileNotFoundException ex) {
            return false;
        }
        return true;

    }
}
