package com.company;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {


        // Step 0) Define the variables we need to compute a user BMI
            float height, weight, bmi;

        // Step 0.1) Promp the user to enter in the person's height and weight
            System.out.println("Enter the next the next person's information:");

        // Step 1) Define a scanner object so a user can enter in data from the console
            Scanner console = new Scanner(System.in);

        // Step 2) Prompt the user to enter in their height and weight into the console, and store the inputs to their corresponding variables
            System.out.print("\theight (in inches) = ");
            height = console.nextFloat();

            System.out.print("\tweight (in pounds) = ");
            weight = console.nextFloat();

       // Step 3) Implement the given height and weight of the user into the BMI formula
            bmi = (float) ((weight/ Math.pow(height, 2) ) * 703);



       // Step 4) Display to the user their BMI
            System.out.printf("\nPerson #1 BMI = %.2f", bmi + "and you are considered ");

       // Step 5) Decide if the user is underweight - obese and display it to the user based on their bmi
            // bmi < 18.5 -> underweight
            // bmi > 18.5 && bmi >= 24.9 -> normal
            // bmi > 25.0 && bmi >= 29.9 -> overweight
            // bmi > 30.0 -> obese


            if (bmi >= 30.0) {
                System.out.println("\nobese");
            } else if (bmi >= 25.0) {
                System.out.println("\noverweight");
            } else if (bmi >= 18.5 ) {
                System.out.println("\nnormal");
            } else {
                System.out.println("\nunderweight");
            }

    }
}
