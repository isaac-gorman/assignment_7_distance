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
    import java.lang.reflect.Array;
    import java.util.Random;
    import java.text.DecimalFormat;

public class Stats {

    public static void main(String[] args) {
            // Step 2) Declare constants and other local variables
        final int MAX_COUNT = 50;
        int[] numbers = new int[MAX_COUNT];
        int i, rangeRandomNumbers;
        double mean, std;
        String rangeRandomNumbersText, output = "";

            // Step 3) Instantiate objects for number generating,
            // and for formatting numbers, respectively;
         Random gen = new Random();
         DecimalFormat fmt = new DecimalFormat("0.##");

            // Step 4) Prompt the user for a number that will be
            // used as a range of numbers to be generated randomly
            // then read it in and convert it to an 'int'
        rangeRandomNumbersText =
                JOptionPane.showInputDialog(null,
                        "Please enter a range of numbers " +
                        " to be generated:");
        rangeRandomNumbers = Integer.parseInt(rangeRandomNumbersText);

            // Step 5) Generate 'MAX_COUNT' numbers whose values will be
            // between 0 and 'rangeRandomNumbers - 1' and insert them into
            // the elements of the array 'numbers'
        JOptionPane.showMessageDialog(null,
                "Thank you for your number. Your range of values will be between 0 and " +
                        (rangeRandomNumbers - 1),
                        "Your range of numbers",
                        JOptionPane.INFORMATION_MESSAGE
                );

        for (i = 0; i < MAX_COUNT; i++) {
            numbers[i] = gen.nextInt(rangeRandomNumbers);
        } // end for loop

            // Step 6) Build up a string to display numbers of array 'numbers'
        for (i = 0; i < numbers.length; i++) {
                // format nicely
            if (i % 2 == 0) { // even number element
                              // display on beginning of new line
                              // separate next display by three blank spaces
                output += "Element " + i +
                          "has : " + numbers[i] +
                          "   ";
            } // end if statement
            else { // odd number element, display on the same line
                   // but then advance to the new line at end
                output += "Element " + i +
                        "has : " + numbers[i] +
                        "\n";
            } // end else statement
        } // end for loop

            // display the numbers form the array "numbers"
        JOptionPane.showMessageDialog(null,
                output,
                "Your array with the generated numbers",
                JOptionPane.INFORMATION_MESSAGE);


            // Step 7.1) Invoke the static method 'calculateMean' to obtain
            // the mean of the numbers
        mean = calculateMean(numbers);

            // Step 8.1) Invoke the static method 'standardDeviation' to obtain
            // the standard deviation of the numbers
        std = standardDeviation(numbers);

            // display the mean and standard deviation with nice formatting
        JOptionPane.showMessageDialog(null,
                "Mean: " + fmt.format(mean) +
                "\nStandard Deviation: " + fmt.format(std),
                "The mean and standard deviation",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "This program was written by Isaac Gorman Uribe. Thanks for using it." +
                "\nEnd of program.",
                "Good bye!",
                JOptionPane.INFORMATION_MESSAGE);
    } // end main method


    // Step 8.2) Build standardDeviation() ****************************
    public static double standardDeviation(int[] nums) {
        // - declare local variables to be used in calculating
        // - - the standard deviation
        double result, mean, std;
        int i;

        result = 0.0;
        // - obtain the mean using our existing method 'calculateMean()'
        mean = calculateMean(nums);
        // - traverse the array 'numbers' and sum up all the intermediate values
        for (i = 0; i < nums.length; i++) {
            result += Math.pow(nums[i] - mean, 2.0);
        }
        // - calculate the remaining part of the standard deviation
        std = Math.sqrt(result) / (nums.length - 1);
        // - return 'standardDeviation'
        return std;
    } // end standardDeviation method

    // ************************************************************


    // Step 7.2) Build calculateMean() ****************************
    public static double calculateMean(int[] nums) {
            // - declare the local variables to be used in calculating the mean
        double sum, average;
        int i;

        sum = 0.0;
            // - traverse the array 'numbers'
            // - sum all the values of each element
       for (i = 0; i < nums.length; i++) {
           sum += nums[i];
       }
            // - calculate the 'average' for these numbers
        average = sum / nums.length;
            // - return the 'average'
        return average;
    } // end calculateMean method
    // ************************************************************

} // end Stats class
