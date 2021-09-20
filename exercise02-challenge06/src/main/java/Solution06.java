/*
 *  UCF COP3330 Fall 2021 Assignment 06 Solution
 *  Copyright 2021 Justin Mazor
 */


import java.util.Scanner;
import java.time.Year;

public class Solution06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = sc.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retire = sc.nextInt();

        System.out.println("You have " + (retire-age) + " years left until you can retire.");
        int year = Year.now().getValue();
        System.out.print("It's " + year + ", so you can retire in " + (year+(retire-age)) + ".");
    }
}
