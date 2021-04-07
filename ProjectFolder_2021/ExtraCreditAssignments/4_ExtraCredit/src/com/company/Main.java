package com.company;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        giveIntro();
        Scanner console = new Scanner(System.in);
        double bmi1 = getBMI(console);
        double bmi2 = getBMI(console);
        reportResults(bmi1, bmi2);
    }

    // Step 1) Create a method that introduces the user to the program
    public static void giveIntro() {
        System.out.println("This program reads data for two");
        System.out.println("people and computes their body");
        System.out.println("mass index and weight status");
        System.out.println();
    }

    // Step 2) Create a method that prompts the user to enter in the users info and returns their bmi
    public static double getBMI(Scanner console){
        System.out.println("Enter next person's information:");

        System.out.print("\theight (in inches) = ");
        double height = console.nextFloat();

        System.out.print("\tweight (in pounds) = ");
        double weight = console.nextFloat();

        double bmi = calcBMI(height, weight);
        return bmi;
    }

    // Step 3) Create a method calculating the BMI based on the inputs from the user
    public static double calcBMI(double height, double weight) {
        return (float) ((weight/ Math.pow(height, 2) ) * 703);
    }

    // Step 4) Create a method that that reports the overall bmi and weight status
    static void reportResults(double bmi1, double bmi2){
        System.out.printf("\nPerson #1 BMI = %.2f", bmi1);
        reportStatus(bmi1);

        System.out.printf("\nPerson #2 BMI = %.2f", bmi2);
        reportStatus(bmi2);
    }

    // Step 5) Create a method that returns the weight status given the users BMI score
    static void reportStatus(double bmi){
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
