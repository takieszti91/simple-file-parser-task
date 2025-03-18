package org.interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextAnalyzer {
    private int totalNum = 0;
    private int uniqueNum = 0;
    private HashMap<String, Integer> words = new HashMap<>();
    public TextAnalyzer(String fileName) {
        try {
            Scanner myReader = new Scanner(new File(fileName));
            while (myReader.hasNextLine()) {
                for (String word : myReader.nextLine().toLowerCase().replaceAll(",|\\.|;|!|\\?", "").split(" ")){
                    addWord(word);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(-1);
        }
    }

    private void incrementTotalNum() {
        this.totalNum++;
    }

    private void incrementUniqueNum() {
        this.uniqueNum++;
    }

    public void addWord(String word) {
        incrementTotalNum();
        if(this.words.containsKey(word)){
            this.words.replace(word, this.words.get(word) + 1);
        } else {
            incrementUniqueNum();
            this.words.put(word, 1);
        }
    }

    public void setWords(HashMap<String, Integer> words) {
        this.words = words;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public int getUniqueNum() {
        return uniqueNum;
    }

    public HashMap<String, Integer> getWords() {
        return words;
    }
}
