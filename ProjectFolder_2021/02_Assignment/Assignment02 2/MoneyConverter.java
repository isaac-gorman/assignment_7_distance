//------------------------------------------------------//
// Programmer: Isaac Gorman Uribe
// Course:COSC 1336 Section 006/009
// Semester: Spring 2021
// Assignment#: 2
// DueDate: February 10, 2021
// -----------------------------------------------------

package com.company;
    // Step 0) Importing the Scanner class to enable reading in from the keyboard
        import java.util.Scanner;

public class MoneyConverter {

    public static void main(String[] args) {
        // STEP 1) Declaring constants representing penny amounts
            final int TEN_DOLLARS = 1_000;
            final int FIVE_DOLLARS = 500;
            final int ONE_DOLLAR = 100;
            final int QUARTER = 25;
            final int DIME = 10;
            final int NICKEL = 5;
            final int HUNDRED = 100;


        // STEP 2) Declaring variables
            int tens, fives, ones, quarters, dimes, nickels, remainingCents;
            double total, twiceAmount, halfAmount;
            double addTwoDollars, subtractOneDollar;
            char dollarSign, cents;
            String prefix, firstName, lastName;

            dollarSign = '$';
            cents = 162;

            prefix = "Sir. ";
            firstName = "Isaac";
            lastName = "Gorman";


        // STEP 3) Instantiating an object from the Scanner class to enable reading from keyboard
            Scanner keyboard = new Scanner(System.in);


        // STEP 4) Prompt the user to enter in the money amount then read it in
            System.out.print("Please enter the monetary amount:");
            total = keyboard.nextDouble();

        // STEP 5) Preform calculations on entered monetary amount by the user
        // - calculate twice, half, adding two dollars
        // - subtracting one dollar from the entered amount
            twiceAmount = total * 2.0;
            halfAmount = total / 2.0;
            addTwoDollars = total + 2.0;
            subtractOneDollar = total - 1.0;


        // STEP 6) Convert the amount of money read into cents
            remainingCents = (int) (total * HUNDRED);
            System.out.println("remaining cents: " + remainingCents);


        // STEP 7) Print out the current calculations
            System.out.println("\nThe amount of " + dollarSign + total
                    + " is equivalent to " + remainingCents + cents
                    + " " + "(cents)"
            );

            System.out.println("\tTwice the amount is: " + dollarSign + twiceAmount + "!");
            System.out.println("\tHalf the amount is: " + dollarSign + halfAmount + "!");
            System.out.println("\tAdding two dollars is: " + dollarSign + addTwoDollars + "!");
            System.out.println("\tSubtracting one dollar is: " + dollarSign + subtractOneDollar + "!");


        // STEP 8) Calculate dollar and cent amounts
            tens = remainingCents / TEN_DOLLARS;
            remainingCents %= TEN_DOLLARS;

            fives = remainingCents / FIVE_DOLLARS;
            remainingCents %= FIVE_DOLLARS;

            ones = remainingCents / ONE_DOLLAR;
            remainingCents %= ONE_DOLLAR;

            quarters = remainingCents / QUARTER;
            remainingCents %= QUARTER;

            dimes = remainingCents / DIME;
            remainingCents %= DIME;

            nickels = remainingCents / NICKEL;
            remainingCents %= NICKEL;

            int pennies = remainingCents / 1;


        // STEP 9) Print equivalency calculations
            System.out.println("\nThat's equivalent to: ");
            System.out.println("\t"+ tens + " ten dollar bills");
            System.out.println("\t"+ fives + " five dollar bills");
            System.out.println("\t"+ ones + " one dollar bills");
            System.out.println("\t"+ quarters + " quarters");
            System.out.println("\t"+ dimes + " dimes");
            System.out.println("\t"+ nickels + " nickels");
            System.out.println("\t"+ pennies + " pennies");


        // STEP 10) Print my name and end the program
            System.out.println("\nThis program was written by " + prefix + firstName + " " + lastName);
            System.out.println("End of program.");








    } // end method main
} // end class MoneyConverter
