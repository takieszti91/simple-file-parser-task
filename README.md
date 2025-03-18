# File Parser Task
This project serves as a solution to a professional test. I created it to demonstrate my technical skills and expertise. The original task description is provided below.

## Part 1: Java and Object-Oriented Programming Test
### Task: File Parser, Analyzer, and Report Generator
Objective: Develop a Java application that reads a text file, parses its contents, and provides a detailed analysis of the words used, along with a summary report generation feature.
Functional Requirements:
1. Read a Text File: The application should take a file path as input and read the contents of the text file.
2. Word Count and Frequency Analysis: Count the number of times each word appears and calculate the frequency as a percentage of the total word count.
3. Summary Report: Generate a summary report with the following details: Total word count.
   Top 5 most frequent words and their frequencies. Number of unique
   words.
4. Object-Oriented Design: Use classes and objects to structure the application. For example, create a TextAnalyzer class for analysis and a ReportGenerator class for report
   generation.
5. Output: The summary report should be printed to the console

### Example Input (Text File)
Suppose the input file ```example.txt``` contains the following text:
```
Hello world. This is a simple text file for testing.
This file contains words. Some words are repeated, like words, file, and this.
```

### Expected Output
The output should provide a detailed summary report. For the given example, it might look something like this:
```
Total Word Count: 18
Top 5 Most Frequent Words:
words - 3 (16.67% )
file - 2 (11.11%)
this - 2 (11.11%)
Hello - 1 (5.56% )
world - 1 (5.56% )
Number of Unique Words: 15
```

## Note
I considered all words in the calculation, including the shortest one ("a").
I converted the words to their lowercase form, so, for example, "This" and "this" are counted as the same.
