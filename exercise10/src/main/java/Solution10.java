/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;
import java.util.Formatter;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        double q1 = sc.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price2 = sc.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        double q2 = sc.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = sc.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        double q3 = sc.nextInt();

        double sub = (price1 * q1) + (price2 * q2) + (price3 * q3);
        double tax = sub * 0.055;
        double total = tax + sub;
        System.out.printf("Subtotal: $%.2f%n", sub);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);

    }
}
