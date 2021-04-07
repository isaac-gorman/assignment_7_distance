//------------------------------------------------------//
// Programmer: Isaac Gorman Uribe
// Course:COSC 1336 Section 006/009
// Semester: Spring 2021
// Assignment#: 6
// DueDate: March 24, 2021 @11:59 pm
// -----------------------------------------------------


package com.company;
// Step 0) Import the Scanner class to enable reading in form the keyboard
    import java.util.Locale;
    import java.util.Scanner;

public class HiLow {

    public static void main(String[] args) {
// Step 1) Declare the variables that will be used in the program
        final int MAX = 100;
        int target, currentCount, guess;
        int overallGuessCount, totalTargetCount;
        String again, stringOutput;
        float average;

// Step 2) Assign currentCount, overallGuessCount, and totalTargetCount the value of 0
        currentCount = 0;
        overallGuessCount = 0;
        totalTargetCount = 0;

// Step 3) Instantiate an Object from the Scanner class to enable reading from the keyboard
        Scanner keyboard = new Scanner(System.in);

// Step 4) Construct a do-while loop to control whether a user wants to continue playing the game.
// - This will be an outer do-while loop, that will have an inner do while-loop.
// - Write the outer do-while loop's condition as: while (again.equalsIgnoreCase ("y"));
        do
        {
            // Step 5) Instruct the user what to do
                System.out.println("Guess a number between 1 and " + MAX);

            // Step 6) Using the static Math class, invoke the random method to generate a number between ...
            // 1 and 100
                target = (int) (Math.random() * MAX) + 1;

           // Step 7) Increment how many times a new number is generated using the totalTargetCount variable
                totalTargetCount++;

           // Step 8) Initialize currentCount to be zero
                currentCount = 0;


          // Step 9) Construct an inner do-while loop to control the amount of times a user needs to successfully guess the target number
          // the condition for the do-while loop will be: while(guess != target && guess > 0);
                do
                {
                    // Step 10) Prompt the user to enter in their guess, then read it in
                        System.out.print("Please enter your guess (0 to quit): ");

                   // Step 11) Read in the user's guess and parse it into an integer
                        guess = Integer.parseInt(keyboard.nextLine());

                   // Step 12) Increment the appropriate variables, currentCount, and overallGuessCount
                        currentCount++;
                        overallGuessCount++;

                   // Step 13) Using an if statement, determine whether the user entered a number > 0
                   // if this is true, then evaluate whether the guess was less than, greater than or equal to the target number
                   // print out the appropriate message for each case
                   // Note: This will be the end of the inner do-while loop

                    if (guess > 0) {
                        if (guess > target) {
                            System.out.println("Your guess was too HIGH.");
                        } else if (guess < target) {
                            System.out.println("Your guess was too LOW.");
                        } else {
                            System.out.println("Right! Amount of guesses: " + currentCount );
                        }
                    } // end outer if statement

                } while (guess != target && guess > 0);

            // Step 14) Prompt the user if they would like to play again, then read in their response.
            // Note this will be the end of the outer do-while loop
            System.out.print("Would you like to play again? (y/n):");
            again = keyboard.nextLine();



        } while (again.equalsIgnoreCase ("y"));


// Step 15) Calculate overall average for amount of guess by the user
        average = overallGuessCount / totalTargetCount;


// Step 16) Using a conditional operator determine if the user is a good guesser or not. Assign this to the string stringOutput
        stringOutput = (average > 10.0) ? "are a new strategy!" : "are a great guesser!";


// Step 17) Print out the appropriate message for the average guesses, number of target numbers, and overall guesses
        System.out.println("\nYou " + stringOutput);
        System.out.println("\nYou averaged " + average + " guesses for " + totalTargetCount + " targets");
        System.out.println("\nOverall guess count: " + overallGuessCount);


// Final Step) Communicate to the user that the program has ended and who has written the program
        System.out.println("\nThis program was written by Isaac Gorman Uribe");
        System.out.println("End of program. Thank you!");

    } // end main method
} // end class HiLow
