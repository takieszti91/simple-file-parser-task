package org.interview;

import java.util.*;

public class TextAnalyzerSorted extends TextAnalyzer {
    public TextAnalyzerSorted(String fileName) {
        super(fileName);
        setWords(sortDescByValue(getWords()));
    }

    static HashMap<String, Integer> sortDescByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        list.sort((i1, i2) -> i2.getValue().compareTo(i1.getValue()));

        HashMap<String, Integer> sorted = new LinkedHashMap<String, Integer>();
        for (HashMap.Entry<String, Integer> item : list) {
            sorted.put(item.getKey(), item.getValue());
        }
        return sorted;
    }

    public float getPercentage(int num){
        return (float) (num * 100) / this.getTotalNum();
    }
}
