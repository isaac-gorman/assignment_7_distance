//------------------------------------------------------//
// Programmer:    Isaac Gorman Uribe
// Course:        COSC 1336 Section 006/009
// Semester:      Spring 2021
// Assignment#:   7
// DueDate:       April 7, 2021 @11:59 pm
// -----------------------------------------------------

package com.company;

// Step 0) Import swing class for using GUI
import javax.swing.*;


public class Distance {

    public static void main(String[] args) {
	// Step 2) Declare the variables that will be used
        String x1Text, y1Text, x2Text, y2Text, output;
        int x1, y1, x2, y2;
        double distance;


    // Step 3) Prompt the user to enter point1 for the first x, y coordinates then read them in via JOptionPane
        x1Text  = JOptionPane.showInputDialog(null,
                "Enter the x coordinate for the first point ");
        x1 = Integer.parseInt(x1Text);

        y1Text  = JOptionPane.showInputDialog(null,
                "Enter the y coordinate for the first point ");
        y1 = Integer.parseInt(y1Text);


        // Step 4) Prompt the user to enter point2 for the first x, y coordinates then read them in via JOptionPane
        x2Text  = JOptionPane.showInputDialog(null,
                "Enter the x coordinate for the second point ");
        x2 = Integer.parseInt(x2Text);

        y2Text  = JOptionPane.showInputDialog(null,
                "Enter the y coordinate for the second point ");
        y2 = Integer.parseInt(y2Text);

        // Step 5.1) // Invoke the calculate method and assign it to distance

        distance = calculate(x1, y1, x2, y2);

        // Step 6) Build up a string for displaying info about the two points
        output = "\nFirst point:" + "\nx1: " + x1 + "\ny1: " + y1 +
                 "\n\nSecond point:" + "\nx2: " + x2 + "\ny2: " + y2 +
                 "\n\nDistance: " + distance;

        // Step 7.1) Invoke the method 'displayString' to display the built in string 'output'
        displayString(output, "Current coordinates in 'main'");

        // Step 8.1) Invoke the method 'changePoints"
        changePoints(x1, y1, x2, y2);

        // Step 12) Recalculate the distance
        distance = calculate(x1, y1, x2, y2);

        // Step 13) Build a string that for displaying the info about the two points and the distance between them
        // will there be a change?
        output = "\nNew Distance"+
                "\nFirst point:" + "\nx1: " + x1 + "\ny1: " + y1 +
                "\n\nSecond point:" + "\nx2: " + x2 + "\ny2: " + y2 +
                "\n\nDistance: " + distance;

        // Step 14) Invoke displayString( ) method again
        displayString(output, "Current coordinates in 'main'");


        // Step 15) Build a string that displays your name
        output = "\nThis program was written by Isaac Gorman.Thanks for using it." + "\nEnd of program";

        // Step 16) Invoke displayString( ) a final time to display the final output
        displayString(output, "End of program, Goodbye");


    } // end main method

    // Step 5.2 ) calculate method
    public static double calculate(int a1, int b1, int a2, int b2) {
        double answer;

        double delta_x = Math.pow((a2 - a1) , 2);
        double delta_y = Math.pow((b2 - b1) , 2);
        answer = Math.sqrt((delta_x + delta_y));
        return answer;
    } // end calculate method

    // Step 7.2) displayString method
    public static void displayString(String outString, String header) {

        // Step 8) display the string 'outString" via JOptionPane
        JOptionPane.showMessageDialog(null,
                                        outString,
                                        header,
                                        JOptionPane.INFORMATION_MESSAGE);
    } // end displayString method

    // Step 8.2) changePoints method
    public static void changePoints(int a1, int b1, int a2, int b2) {

        // Step 9) Declare a local variable called tempString
        String tempString;

        // Step 10) Multiply point1 variables by 2, point2 by 3
        a1 *= 2;
        b1 *= 2;
        a2 *= 3;
        b2 *= 3;

        // Step 11) Build a string for displaying the output and assign it to "tempString"
        tempString = "\nFirst point:" + "\na1: " + a1 + "\nb1: " + b1 +
                "\n\nSecond point:" + "\na2: " + a2 + "\nb2: " + b2;

        // Step 12) Display the points via JOptionPane
        JOptionPane.showMessageDialog(null,
                                        tempString,
                                        "Inside 'changePoints' method ",
                                        JOptionPane.INFORMATION_MESSAGE);

    } // end changePoints method

} // end Distance Class
