//------------------------------------------------------//
// Programmer:    Isaac Gorman Uribe
// Course:        COSC 1336 Section 006/009
// Semester:      Spring 2021
// Assignment#:   Assignment 10
// DueDate:       May 5th, 2021 @11:59 pm
// -----------------------------------------------------

package com.company;

        // Step 1) Import classes and pac needed for the project
    import javax.swing.*;
    import java.text.DecimalFormat;
    import java.util.Random;

public class FunWithArrays {

    public static void main(String[] args) {
            // Step 2) Declare constants and other variables for the program
        final int MAX_COUNT = 50;
        int[] numbers = new int[MAX_COUNT];
        int i, rangeRandomNumbers, index;
        String rangeRandomNumbersText;

            // Step 3) Instantiate objects for number generating
            // and for formatting numbers, respectively.
        Random gen = new Random();
        DecimalFormat fmt = new DecimalFormat("0.##");

            // Step 4) Prompt the user to enter in a number that will be used as
            // a range of numbers to generated randomly, then read it in and
            // parse it to an 'int'
        rangeRandomNumbersText = JOptionPane.showInputDialog(null,
                "Please enter a range of numbers " +
                        " to be generated:");
        rangeRandomNumbers = Integer.parseInt(rangeRandomNumbersText);

        JOptionPane.showMessageDialog(null,
                "Thank you for your number. Your range of values will be between 0 and " +
                        (rangeRandomNumbers - 1),
                "Your range of numbers",
                JOptionPane.INFORMATION_MESSAGE
        );

            // Step 5) Generate random numbers and insert them into
            // each element of the array 'numbers'
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = gen.nextInt(rangeRandomNumbers);
        } // end for loop

            // Step 6) Invoke displayArray() to display all the numbers in the array numbers
        displayArray(numbers, "" +
                "Your array with the generated numbers");

            // Step 7) Invoke findLargest() to find the index of the largest
            // number in the array numbers then display that number and its index
        index = findLargest(numbers);
        JOptionPane.showMessageDialog(null, "The largest number in the array is " +
                numbers[index] + " at location " + index, "Largest number",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The largest number in the array is " +
                numbers[index] + " at location " + index);

            // Step 8) Invoke findSmallest() to find the index of the smallest number in the array
            // then display that number and its index
        index = findSmallest(numbers);
        JOptionPane.showMessageDialog(null, "The smallest number in the array is " +
                        numbers[index] + " at location " + index, "Smallest number",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The smallest number in the array is " +
                numbers[index] + " at location " + index);

            // Step 9) Invoke displayArray to display all the numbers in the array 'numbers'
        displayArray(numbers, "" +
                "Your array with the generated numbers");

            // Step 10) Invoke modifyEvens to modify only those numbers whose indices are even
        modifyEvens(numbers);
        displayArray(numbers, "" +
                "Your array with the the altered numbers");

            // Step 11) Complete the program and tell the user who wrote it
        JOptionPane.showMessageDialog(null,
                "This program was written by Isaac Gorman Uribe. Thanks for using it." +
                        "\nEnd of program.",
                "Good bye!",
                JOptionPane.INFORMATION_MESSAGE);
    } // end main method

    public static void displayArray(int[] numbers, String header) {
        int i;
        String output = "";
            // build up string to display numbers of array 'numbers'
        for (i =0; i < numbers.length; i++) {
                // even number element,display on beginning of new line and
                // separate next display by three blank spaces
            if (i % 2 == 0) {
                output += "element " + i + " has: " + numbers[i] + "   ";
            } else {
                    // odd number element, display on same line but then advance to
                    // new line at end
                 output += "element " + i + " has: " + numbers[i] + "\n";
            }
        }
            // display the numbers from
            // the array 'numbers'
        JOptionPane.showMessageDialog(null,
                output,
                header,
                JOptionPane.INFORMATION_MESSAGE);
    } // end displayArray method

    public static int findLargest(int[] numbers) {
        int i, largestNumber, indexOfLargestNumber;
            // first number will temporarily
            // be the largest number
        indexOfLargestNumber = 0;
        largestNumber = numbers[0];
            // iterate through all the numbers
            // in the array to see which is
            // the largest number
        for (i = 0; i < numbers.length; i++){
            if(numbers[i] > largestNumber){
                largestNumber = numbers[i];
                indexOfLargestNumber = i;
            } // end if statement
        } // end for loop
            // return index of largest number in array
        return indexOfLargestNumber;
    } // end findLargest method

    public static int findSmallest(int[] numbers) {
        int i, smallestNumber, indexOfSmallestNumber;
            // first number will temporarily
            // be the largest number
        indexOfSmallestNumber = 0;
        smallestNumber = numbers[0];
            // iterate through all the numbers
            // in the array to see which is
            // the largest number
        for (i = 0; i < numbers.length; i++){
            if(numbers[i] < smallestNumber){
                smallestNumber = numbers[i];
                indexOfSmallestNumber = i;
            } // end if statement
        } // end for loop
        // return index of largest number in array
        return indexOfSmallestNumber;
    } // end findSmallest method

    public static void modifyEvens(int [] numbers) {
        int i;
//        int[] alteredArray = new int[numbers.length];
         for (i = 0; i < numbers.length; i = i + 2){
            numbers[i] = numbers[i] + 1_000;
         }
//        for (i = 0; i < numbers.length; i++) {
//            if (i % 2 == 0) {
//                numbers[i] += 1_000;
//            }
//            alteredArray[i] = numbers[i];
//        }
//        return alteredArray;
    } // end modifyEvens module
} // end FunWithArrays class
