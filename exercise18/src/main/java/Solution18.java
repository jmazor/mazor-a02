/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert Celsius to Fahrenheit");
        System.out.print("Your choice: ");
        String c = sc.next();
        System.out.print("Please enter the temperature in");
        int temp = 0;
        String conv = "ERROR";
        if (c.equals("c") || c.equals("C")) {
            conv = "Celsius";
            System.out.print(" Fahrenheit: ");
            temp = sc.nextInt();
            temp = (temp - 32) * 5/9;
        }
        else if (c.equals("f") || c.equals("F")) {
            conv = "Fahrenheit";
            System.out.print(" Celsius: ");
            temp = sc.nextInt();
            temp = (temp * 9 / 5) + 32;
        }
        else {
            System.out.println("\nERROR Please Select Fahrenheit or Celsius");
        }
        System.out.print("The temperature in " + conv + " is " + temp + ".");



    }
}
