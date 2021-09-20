/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 if you are a male or a 2 if you are female: ");
        int gender = 0;
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                gender = sc.nextInt();
                break;
            } else {
                System.out.print("Enter a number: ");
                sc.next();
            }
        }

        double r = (gender == 1)
                ? 0.73
                : 0.66;


        System.out.print("How many ounces of alcohol did you have? ");
        int alc = 0;
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                alc = sc.nextInt();
                break;
            } else {
                System.out.print("Enter a number: ");
                sc.next();
            }
        }
        System.out.print("What is your weight, in pound? ");
        int weight = 0;
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                weight = sc.nextInt();
                break;
            } else {
                System.out.print("Enter a number: ");
                sc.next();
            }
        }

        System.out.print("How many hours has it been since your last drink? ");
        int hours = 0;
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                hours = sc.nextInt();
                break;
            } else {
                System.out.print("Enter a number: ");
                sc.next();
            }
        }

        double bac =  (alc * 5.14 / weight * r) - .015 * hours;
        System.out.print("Your BAC is ");
        System.out.printf("%.6f%n", bac);
        if (bac < 0.08) {
            System.out.print("It is legal for you to drive");
        }
        else {
            System.out.print("It is not legal for you to drive");
        }
    }
}
