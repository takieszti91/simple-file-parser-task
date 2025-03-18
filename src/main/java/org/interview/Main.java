package org.interview;

public class Main {
    private static final String DEFAULT_FILENAME = "example.txt";
    public static void main(String[] args) {
        try {
            new ReportGenerator(new TextAnalyzerSorted(args[0]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Filename is missing. Use default example file: " + DEFAULT_FILENAME);
            new ReportGenerator(new TextAnalyzerSorted(DEFAULT_FILENAME));
        }
    }
}
