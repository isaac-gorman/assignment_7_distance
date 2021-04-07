//------------------------------------------------------//
// Programmer:    Isaac Gorman Uribe
// Course:        COSC 1336 Section 006/009
// Semester:      Spring 2021
// Assignment#:   7
// DueDate:       April 14, 2021 @11:59 pm
// -----------------------------------------------------


// Step 1) Import packages for classes will need to build this program
// - swing class: JOptionPane GUI
// - Random class: Generating random numbers
// -
package com.company;

public class Username {

    public static void main(String[] args) {

        // Step 2) Declare all the variables that will be used for this program

        // Step 3) Instantiate an object from the Random class

        // Step 4.1) Invoke the method readInName(String title, salutation, keyboard object)
        // - to read in the users first and last name. Salutation must be either Dr. Mr, Mrs, Ms
        // Step 4.2) Build the readInName method. Using JOptionPane read in the names
        // *********************************************************
        // - - readInName sudo code:
        // - - - declare local variable called 'oneString'
        // - - - prompt the user to enter their full name and then read it in via JOptionPane
        // - - - add on a salutation
        // - - - return 'oneString'
        // *********************************************************


        // Step 5.1) Generate a random number between 1 - 100, then display that number by invoking the displayString method
        // Step 5.2) Build the displayString method to display information via JOptionPane on a dialogue box
        // *********************************************************
        // - - displayString sudo code:
        // - - - display the formal parameter 'outString' use JOptionPane
        // *********************************************************


        // Step 6) Using conditional logic evaluate if the number is larger than 70. If so invoke displayString

        // Step 7.1) Invoke createUserName(String firstName, String lastName, int randomNumber)
        // Step 7.2) Build createUserName() to create a unique username based on the firstName, lastName, and randomNumber
        // *********************************************************
        // - - createUserName sudo code:
        // - - - declare local variable 'newName'
        // - - - strip off the salutation
        // - - - construct a username with the first character or the first name,
        // - - - three characters of the last name (starting with the second letter),
        // - - - and the with a random number from 1 - 100
        // - - - convert the username to lowercase
        // - - - return 'newName'
        // *********************************************************


        // Step 8) Display the userName created by passing it to the displayString method

        // Step 9) Determine the length of the string 'lastName' and assign it to 'strLen'

        // Step 10.1) Via JOptionPane prompt the user to enter in a number that is no longer than 'strLen'.
        // - This will be accomplished by invoking the readInNumber(String title, int 10) method
        // Step 10.2) Build the readInNumber()
        // *********************************************************
        // - - readInNumber sudo code:
        // - - - declare local variable called 'aNumber'
        // - - - prompt the user and enter a number and read it in via JOptionPane
        // - - - if the number is greater than 100,000,000 reduce it by a factor of 10 (divide by 10)
        // - - - return 'aNumber'
        // *********************************************************


        // Step 11) Assign 'number' to copyNumber

        // Step 12.1) Using a while loop invoke both getSingleNumber() and changeNumber()
        // - till the number is displayed backwards one number per line.
        // Step 12.2) Build the getSingleNumber() method
        // *********************************************************
        // - - getSingleNumber sudo code:
        // - - - declare local variable called 'oneNumber'
        // - - - get the last digit 'n' and the return it
        // *********************************************************


        // Step 12.2) Build the changeNumber() method
        // *********************************************************
        // - - changeNumber sudo code:
        // - - - chop off (truncate) the last digit of number 'n' abd then return ...
        // - - - ... what is left of number 'n'
        // *********************************************************


        // Step 13) Invoke the displayString() to display the 'output' string

        // Step 14) Build the string for the final output

        // Step 15) Display the final 'output' string by invoking the method 'displayString'
        

    } // end of main method
} // end class Username
