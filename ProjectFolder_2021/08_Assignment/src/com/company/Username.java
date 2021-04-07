//------------------------------------------------------//
// Programmer:    Isaac Gorman Uribe
// Course:        COSC 1336 Section 006/009
// Semester:      Spring 2021
// Assignment#:   7
// DueDate:       April 14, 2021 @11:59 pm
// -----------------------------------------------------
package com.company;

// Step 1) Import packages for classes will need to build this program
// - swing class: JOptionPane GUI
// - Random class: Generating random numbers
import javax.swing.*;
import java.util.Locale;
import java.util.Random;

public class Username {

    public static void main(String[] args) {

        // Step 2) Declare all the variables that will be used for this program
            int strLen, number, n,
                singleNumber, copyNumber;
            String title, firstName, lastName,
                   fullName, userName, output;

        // Step 3) Instantiate an object from the Random class
            Random rand = new Random();

        // Step 4.1) Invoke the method readInName(String title, salutation, keyboard object)
        // - to read in the users first and last name. Salutation must be either Dr. Mr, Mrs, Ms
        title = "Please enter your first name:";
        firstName = readInName(title, "Dr. ");

        title = "Please enter your last name:";
        lastName = readInName(title, "");

        // Step 5.1) Generate a random number between 1 - 100, then display that number by invoking the displayString method
            n = rand.nextInt(100) + 1;
            output = "Your number will be: " + n;
            displayString(output, "Display number");

        // Step 6) Using conditional logic evaluate if the number is larger than 70. If so invoke displayString
            if (n > 70) {
                output = "You will have a large number";
                displayString(output, "Display large number");
            } // end if statement

        // Step 7.1) Invoke createUserName(String firstName, String lastName, int randomNumber)
            userName = createUserName(firstName, lastName, n);

        // Step 8) Display the userName created by passing it to the displayString method
            output = "Your new username is: " + userName;
            displayString( output, "Display name");

        // Step 9) Determine the length of the string 'lastName' and assign it to 'strLen'
            strLen = lastName.length();

        // Step 10.1) Via JOptionPane prompt the user to enter in a number that is no longer than 'strLen'.
        // - This will be accomplished by invoking the readInNumber(String title, int 10) method
            title = "Please enter a number that has no more than " + strLen + " digits:";
            number = readInNumber(title, 10);


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


    // Step 4.2) Build the readInName method. Using JOptionPane read in the names
    // *********************************************************
    public static String readInName(String prompt, String salutation){
        // - - - declare local variable called 'oneString'
        // - - - prompt the user to enter their full name and then read it in via JOptionPane
        String oneString =
                JOptionPane.showInputDialog(null, prompt);
        // - - - add on a salutation
        oneString = salutation + oneString ;
        // - - - return 'oneString'
        return oneString;
    } // end of readInName method
    // *********************************************************


    // Step 5.2) Build the displayString method to display information via JOptionPane on a dialogue box
    // *********************************************************
    public static void displayString(String outString, String header) {
        // - - - display the formal parameter 'outString' use JOptionPane
        JOptionPane.showMessageDialog(null,
                                       outString,
                                       header,
                                       JOptionPane.INFORMATION_MESSAGE);
    } // end of displayString method
    // *********************************************************


    // Step 7.2) Build createUserName() to create a unique username based on the firstName, lastName, and randomNumber
    // *********************************************************
    public static String createUserName(String first, String last, int n) {
        // - - - declare local variable 'newName'
            String newName;
        // - - - strip off the salutation
            first = first.substring(4);
        // - - - construct a username with the first character or the first name,
        // - - - I chose to use .substring() instead of .charAt() to practice .substring as a new concept
            first = first.substring(0,1);
            System.out.println(first);
        // - - - three characters of the last name (starting with the second letter),
            last = last.substring(1, 4);
        // - - - and the with a random number from 1 - 100
            newName = first + last  + n;
        // - - - convert the username to lowercase
            newName = newName.toLowerCase();
        // - - - return 'newName'
            System.out.println(newName);
            return newName;
    } // end createUserName method
    // *********************************************************


    // Step 10.2) Build the readInNumber()
    // *********************************************************
    public static int readInNumber(String prompt, int number) {
        // - - - declare local variable called 'aNumber'
        int aNumber;
        // - - - prompt the user and enter a number and read it in via JOptionPane
        String inputNumber = JOptionPane.showInputDialog(null, prompt);
        aNumber = Integer.parseInt(inputNumber);
        // - - - if the number is greater than 100,000,000 reduce it by a factor of 10 (divide by 10)
        if (aNumber > 100_000_000) {
            aNumber /= number;
            JOptionPane.showMessageDialog(null, "Your number has been reduced by a factor of " + number
                                          ,"Number Reduction", JOptionPane.INFORMATION_MESSAGE);
        } // end if statement
        // - - - return 'aNumber'
        return aNumber;
    } // end of readInNumber
    // *********************************************************


} // end class Username
