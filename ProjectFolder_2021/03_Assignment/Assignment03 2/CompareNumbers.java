//------------------------------------------------------//
// Programmer: Isaac Gorman Uribe
// Course:COSC 1336 Section 006/009
// Semester: Spring 2021
// Assignment#: 3
// DueDate: February 24, 2021 @11:59 pm
// -----------------------------------------------------


package com.company;
// Step 0) Import the Scanner class to enable reading in form the keyboard
    import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
    // Step 1) Declare the variables that will be used in the program
	    int number1, number2;

    // Step 2) Instantiate an Object from the Scanner class to enable reading from the keyboard
        Scanner keyboard = new Scanner(System.in);

    // Step 3) Prompt the user to enter the first and second number, then read it in
        System.out.print("Please enter the first number: ");
        number1 = keyboard.nextInt();
//        System.out.println(number1);

        System.out.print("Please enter the second number: ");
        number2 = keyboard.nextInt();
//        System.out.println(number2);

    // Step 4) Using a conditional statement evaluate if number2 is less than 20
        if (number2 < 20) {
            System.out.println("\nThe second number is less than 20, it is: " + number2);
        }

    // Step 5) Triple the value of the first number, then print it's new value
        number1 *= 3;
        System.out.println("\nnumber1 is now: " + number1);

    // Step 6) Quadruple the value of the second number, then print it's new value
        number2 *= 4;
        System.out.println("number2 is now: " +  number2);

    // Step 7) Determine if the first number is an even number, print out if it is even or odd.
        if (number1 % 2 == 0) {
            System.out.println("\nnumber1 is an even number, it is: " + number1);
        }
        else {
            System.out.println("number1 is an odd number, it is: " + number1);
        }

    // Step 8) Determine if both numbers are over 25;
        if (number1 > 25 && number2 > 25) {
            System.out.println("\nBoth numbers are above 25.");
        }

    // Step 9) Determine if number1 is greater than 50 or if number2 is less than or equal to 10
    // - if either are correct, then print out the appropriate message
        if (number1 > 50 || number2 <= 10) {
            System.out.println("\nnumber1 is over 50 or number2 is less than or equal to 10");
        }

    // Final Step) Communicate to the user that the program has ended and who has written the program
        System.out.println("\nThis program was written by Isaac Gorman Uribe");
        System.out.println("End of program. Thank you!");

    } // end main method
}  // end class CompareNumbers
