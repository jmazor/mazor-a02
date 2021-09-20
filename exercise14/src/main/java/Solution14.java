/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount: ");
        double sub = sc.nextDouble();
        System.out.print("What is the state?: ");
        String state = sc.next();
        double tax = 0;
        if (state.equals("WI") ){
            tax = sub * 0.055;
            System.out.printf("The subtotal is $%.2f.%n", sub);
            System.out.printf("The tax is $%.2f.%n", tax);
        }
        double total = tax + sub;
        total = (total * 100) + 0.99999999;
        total = (int) total;
        total = total / 100;
        System.out.printf("The total is $%.2f.%n", total);
    }

}
