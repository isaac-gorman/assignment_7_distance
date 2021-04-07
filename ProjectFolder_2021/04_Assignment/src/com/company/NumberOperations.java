//------------------------------------------------------//
// Programmer: Isaac Gorman Uribe
// Course:COSC 1336 Section 006/009
// Semester: Spring 2021
// Assignment#: 4
// DueDate: March 3, 2021 @11:59 pm
// -----------------------------------------------------

package com.company;
// Step 0) Import the Scanner class to enable reading in form the keyboard
import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {
// Step 1) Declare the variables that I will use in the program
    int number1, number2;
    int answer1, selection;
    double answer2;
    boolean done, invalidChoice;


// Step 2) Assign variables with values
        answer1 = -1;
        answer2 = -1.0;
        selection = 0;
        done = false;
        invalidChoice = false;


// Step 3) Instantiate an object from the Scanner class to enable reading from the keyboard
        Scanner keyboard = new Scanner(System.in);


// Step 4) Prompt the user to enter in the numbers
        System.out.print("Please enter first number: ");
        number1 = keyboard.nextInt();
//        System.out.println(number1);

        System.out.print("Please enter second number: ");
        number2 = keyboard.nextInt();
//        System.out.println(number2);


// Step 5) Iterate through a while loop until the user wants to exit the program
        while (done != true)
        {
            System.out.println("Please select operation type for " + number1 + " and " + number2);
            System.out.println(
                    "\n1 - add these two numbers" +
                    "\n2 - subtract second number from first number" +
                    "\n3 - multiply both numbers" +
                    "\n4 - integer division (first number / second number)" +
                    "\n5 - floating point division (first number / second number)" +
                    "\n6 - Exit"
            ); // end of menu selection


            // Step 6) Read in from the keyboard what the user has selected and use a nested if statement
            // - to determine the operation the user has selected
                    selection = keyboard.nextInt();

                    if (selection == 1) { // add number1 and number2
                        answer1 = number1 + number2;
                        invalidChoice = false;
                    }
                    else if (selection == 2) { // subtract number2 from number1
                        answer1 = number1 - number2;
                        invalidChoice = false;
                    }
                    else if (selection == 3) { // multiply number1 and number2
                        answer1 = number1 * number2;
                        invalidChoice = false;
                    }
                    else if (selection == 4) { // integer division (number1/number2)
                        answer1 = number1/number2;
                        invalidChoice = false;
                    }
                    else if (selection == 5) { // floating point division (number1/number2)
                        answer2 =  (double) number1/ number2;
                        invalidChoice = false;
                    }
                    else if (selection == 6) { // exit the user from the program
                        done = true;
                        invalidChoice = false;
                    }
                    else {
                        invalidChoice = true;
                        System.out.println("***ERROR*** " + selection + " is not a valid selection. Please try\n" +
                                "again!");
                    }


            // Step 7) Determining the appropriate output to produce based on user input
                    if (selection == 5 && invalidChoice == false) {
                        System.out.println("\nCalculated answer is: " + answer2);
                    }
                    else if (selection != 6 && invalidChoice == false) {
                        System.out.println("\nCalculated answer is: " + answer1);
                    }
                    else {
                        System.out.println("\nNo calculation has been done");
                    }

        } // end of while loop




// Final Step) Communicate to the user that the program has ended and who has written the program
        System.out.println("\nThis program was written by Isaac Gorman Uribe");
        System.out.println("End of program. Thank you!");
    } // end main method
} // end class NumberOperations
