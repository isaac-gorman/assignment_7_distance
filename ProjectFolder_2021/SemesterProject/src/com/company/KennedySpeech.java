package com.company;
import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class KennedySpeech {

    public static void main(String[] args)
        throws FileNotFoundException{

        int max;
        String output;
        File f = new File("OriginalSpeech.txt");
        File f2 = new File("FormattedSpeech.txt");
        File f3 = new File("FormattedSpeech.txt");
        Scanner inputFile = new Scanner(f);
        Scanner inputFile2 = new Scanner(f2);
        PrintStream outputFile = new PrintStream(f3);

        displayAbsolutePath(f);

        max = getNumCharacters();
//        System.out.println("max: " + max);

        output = "\nPresident Kennedy's inaugural speech with " + max + " characters per line:";
        outputFile.println(output);
        outputFile.println();

//        System.out.println(inputFile);
        readFromFile(inputFile, outputFile, max);
//        System.out.println(new File("OriginalSpeech.txt").getAbsolutePath());


        closeFile(inputFile);
        closeFile(outputFile);

        printFormattedSpeech(inputFile2);
        closeFile(inputFile2);

        output = "";
        output = "This progam was written by Isaac Gorman.\nEnd of Program";
        displayString(output);

    }

    public static int getNumCharacters() {
        String numCharactersText;
        int numCharacters;

        numCharactersText = JOptionPane.showInputDialog(null,
                "How many characters per line would you like?");
        numCharacters = Integer.parseInt(numCharactersText);

        return numCharacters;
    }

    public static void displayAbsolutePath(File f) {
        JOptionPane.showMessageDialog(null,
                "The absolute path of the original file is: \n" +
                f.getAbsolutePath(),
                "Absolute path of original file",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void readFromFile(Scanner inputFile, PrintStream outputFile, int max) {
        String word;
        int wordCount, lineCount = 0;
        boolean answer;
//        System.out.println("inputFile.hasNext(): " + inputFile.hasNext());
        while (inputFile.hasNext()) {
            word = inputFile.next();
            wordCount = word.length();

            answer = checkIfParagraphNumber(word);

            if (answer) {
                outputFile.println();
                outputFile.println();
                lineCount = 0;
            } // end if statement

            if (answer == false) {

                if ((lineCount + wordCount + 1) >= max) {
                    lineCount = 0;

                    lineCount = lineCount + wordCount + 1;

                    outputFile.println();
                    outputFile.print(word + " ");
                } // end inner if statement
                else {
                    outputFile.print(word + " ");

                    lineCount = lineCount + wordCount + 1;

                }

            } // end outer if statement
        } // end while loop


}

    public static boolean checkIfParagraphNumber(String word) {
        char aChar;
        int i, n;
        boolean answer;

        n = word.length();
        i = 0;

        while (i < n) {
            aChar = word.charAt(i);

            switch (aChar) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    answer = true;
                    break;
                default:
                    answer = false;
            } // end switch statement

            i++;
        } // end while loop

        aChar = word.charAt(n - 1);

        if (aChar == '#') {
            answer = true;
        } else {
            answer = false;
        }


        return answer;
    }

    public static void printFormattedSpeech(Scanner inputFile2) {
        String line;

        while(inputFile2.hasNext()) {
            line = inputFile2.nextLine();
            System.out.println(line);
        }
    }

    public static void closeFile(Scanner fileName) {
        fileName.close();
    }

    public static void closeFile(PrintStream fileName) {
        fileName.close();
    }

    public static void displayString(String outString) {
        JOptionPane.showMessageDialog(null, outString, "Good bye!",
                JOptionPane.INFORMATION_MESSAGE);
    }

        } // end KennedySpeech class
