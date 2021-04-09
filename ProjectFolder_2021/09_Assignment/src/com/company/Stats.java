//------------------------------------------------------//
// Programmer:    Isaac Gorman Uribe
// Course:        COSC 1336 Section 006/009
// Semester:      Spring 2021
// Assignment#:   Assignment 09
// DueDate:       April 28, 2021 @11:59 pm
// -----------------------------------------------------

package com.company;
        // Step 1) Import classes and packages I need to build the program
    import javax.swing.*;
    import java.util.Random;
    import java.text.DecimalFormat;

public class Stats {

    public static void main(String[] args) {
            // Step 2) Declare constants and other local variables
        final int MAX_COUNT = 50;
        int[] numbers = new int[MAX_COUNT];
        int i, rangeRandomNumbers;
        float mean, std;
        String rangeRandomNumbersText, output;

            // Step 3) Instantiate objects for number generating,
            // and for formatting numbers, respectively;

            // Step 4) Prompt the user for a number that will be
            // used as a range of numbers to be generated randomly
            // then read it in and convert it to an 'int'

            // Step 5) Generate 'MAX_COUNT' numbers whose values will be
            // between 0 and 'rangeRandomNumbers - 1' and insert them into
            // the elements of the array 'numbers'

            // Step 6) Build up a string to display numbers of array 'numbers'

            // Step 7.1) Invoke the static method 'calculateMean' to obtain
            // the mean of the numbers
            // Step 7.2) Build calculateMean() ****************************
            // - declare the local variables to be used in calculating the mean
            // - traverse the array 'numbers'
            // - sum all the values of each element
            // - calculate the 'average' for these numbers
            // - return the 'average'
            // ************************************************************


            // Step 8.1) Invoke the static method 'standardDeviation' to obtain
            // the standard deviation of the numbers
            // Step 8.2) Build standardDeviation() ****************************
            // - declare local variables to be used in calculating
            // - - the standard deviation
            // - obtain the mean using our existing method 'calculateMean()'
            // - traverse the array 'numbers' and sum up all the intermediate values
            // - calculate the remaining part of the standard deviation
            // - return 'standardDeviation'
            // ************************************************************



            // display the mean and standard deviation with nice formatting



    } // end main method
} // end Stats class
