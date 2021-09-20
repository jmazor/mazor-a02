/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amt = sc.nextInt();
        System.out.print("What state do you live in? ");
        String state = sc.next();
        double tax = 0;
        if (state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = sc.next();
            if (county.equals("Eau")) {
                tax = 0.055;
            } else if (county.equals("Dunn")) {
                tax = 0.054;
            } else {
                tax = 0.05;
            }
        } else if (state.equals("Illinois")) {
            tax = 0.8;
        }
        if (state.equals("Wisconsin") || state.equals("Illinois")) {
            tax = tax * amt;
            tax = (tax * 100) + 0.999999999;
            tax = (int) tax;
            tax = tax/100;


            System.out.printf("The tax is $%.2f.%n", tax);
            amt = tax + amt;
        }
        amt = (amt * 100) + 0.999999999;
        amt = (int) amt;
        amt = amt/100;
        System.out.printf("The total is $%.2f.%n", amt);
    }

}
