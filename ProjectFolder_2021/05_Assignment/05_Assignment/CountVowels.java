//------------------------------------------------------//
// Programmer: Isaac Gorman Uribe
// Course:COSC 1336 Section 006/009
// Semester: Spring 2021
// Assignment#: 4
// DueDate: March 3, 2021 @11:59 pm
// -----------------------------------------------------

package com.company;

// Step 0) Import Scanner class to enable reading form the keyboard
import java.awt.image.PackedColorModel;
import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

    // Step 1) Declare the variables to be used in this program
        int acount, ecount, icount;
        int ocount, ucount, ycount;
        int consonant, index;
        String oneString, output, answer;
        char charAnswer;
        boolean keepGoing = true;


    // Step 2) Instantiate an object from the Scanner class to enable reading from the keyboard
        Scanner keyboard = new Scanner(System.in);


    // Step 3) Construct a do-while loop to control whether a user wants to continue entering a string
    // - This will be constructed as an outer do-while loop with an inner for loop



        do {
            // Step 4) Assign the initial values to all the variables
            acount = 0;
            ecount = 0;
            icount = 0;
            ocount = 0;
            ucount = 0;
            ycount = 0;
            consonant = 0;

            // Step 5) Prompt the user to enter in a string, then read it in
            System.out.print("Please enter a string: ");
            oneString = keyboard.nextLine();

            // Step 6) Convert the entire string into lowercase
            oneString = oneString.toLowerCase();
            System.out.println("Lower caser string is now: " + oneString);

            // Step 7) Construct a for loop to iterate the character by character in the string
            // - use the built in string method length() to accomplish this
            for (index = 0; index < oneString.length(); index++) {

                // Step 8) Construct a switch statement to determine what vowel the current
                // - character is or constant and update its proper counter
                switch(oneString.charAt(index))
                {
                    case 'a': acount++; break;
                    case 'e': ecount++; break;
                    case 'i': icount++; break;
                    case 'o': ocount++; break;
                    case 'u': ucount++; break;
                    case 'y': ycount++; break;
                    default: consonant++;
                } // end of switch statement

            } // end of for loop

                // Step 9) Outside of the for loop construct string for printing out the info for
                // - each occurrence of a vowel or consonant
                    output = "\nNumber of each vowel in the string: " +
                            "\na: " + acount +
                            "\ne: " + ecount +
                            "\ni: " + icount +
                            "\no: " + ocount +
                            "\nu: " + ucount +
                            "\ny: " + ycount +
                            "\nconsonant: " + consonant;


                // Step 10) Print out the newly constructed string
                System.out.println(output);


                // Step 11) Prompt the user whether they would like to continue or not
                System.out.println("\n\nWould you like to continue " +
                        "with another word? (y/n) ");
                answer = keyboard.nextLine();


                // Step 12) Extract out the first character of the users response
                charAnswer = answer.charAt(0);

                // Step 13) Using an if-else statement determine whether the user has entered yes or no
                if (charAnswer == 'y' || charAnswer == 'Y') {
                    keepGoing = true;
                }
                else {
                    keepGoing = false;
                } // end for loop


        }  while (keepGoing == true); // end of whole loop




    // Final Step) Communicate to the user that the program has ended and who has written the program
        System.out.println("\nThis program was written by Isaac Gorman Uribe");
        System.out.println("End of program. Thank you!");

    } // end main method
} // end of class CountVowels
