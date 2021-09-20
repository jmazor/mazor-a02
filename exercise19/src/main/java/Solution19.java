/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Justin Mazor
 */


import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter weight in pounds: ");
        double weight = 0;
        while(sc.hasNext()) {
            if (sc.hasNextDouble()) {
                weight = sc.nextDouble();
                break;
            } else {
                System.out.print("Enter a valid weight: ");
                sc.next();
            }
        }
        System.out.print("Please enter Height in inches: ");
        double height = 0;
        while(sc.hasNext()) {
            if (sc.hasNextDouble()) {
                height = sc.nextDouble();
                break;
            } else {
                System.out.print("Enter a valid height: ");
                sc.next();
            }
        }
        double bmi = (weight / (height * height) ) * 703;
        System.out.printf("Your BMI is %.1f.%n", bmi);
        if (bmi < 18.5) {
            System.out.print("You are underweight. you should see a doctor");
        }
        else if (bmi > 25) {
            System.out.print("You are overweight. You should see a doctor");
        }
        else {
            System.out.print("You are within the ideal weight range");
        }


    }
}
