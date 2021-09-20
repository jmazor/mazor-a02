/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        double y = sc.nextDouble();
        double ret = p * (1 + ((r/100) * y));
        ret = (ret * 100) + 0.99999999;
        ret = (int) ret;
        ret = ret / 100;
        System.out.print("After " + y + " years at " + r + " %, the investment will be worth $");
        System.out.printf("%.2f%n", ret);
    }
}
