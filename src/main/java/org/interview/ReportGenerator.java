package org.interview;

import java.util.Map;

public class ReportGenerator {
    private static final int LIMIT = 5;
    public ReportGenerator(TextAnalyzerSorted textAnalyzerSorted) {
        System.out.println("Total Word Count: " + textAnalyzerSorted.getTotalNum());
        System.out.println("Top 5 Most Frequent Words:");
        int i = 0;
        for(Map.Entry<String, Integer> word : textAnalyzerSorted.getWords().entrySet()){
            if(i++ < LIMIT){
                System.out.printf(java.util.Locale.US, "%s - %d (%.2f%%)%n", word.getKey(), word.getValue(), textAnalyzerSorted.getPercentage(word.getValue()));
            } else {
                break;
            }
        }
        System.out.println("Number of Unique Words: " + textAnalyzerSorted.getUniqueNum());
    }
}
