/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int y = sc.nextInt();
        System.out.print("Enter the number of times the interest is compounded per year: ");
        int n = sc.nextInt();
        double ret = Math.pow((1 + ((r/100)/n)), (n * y));
        ret = ret * p;
        ret = (ret * 100) + 0.99999999;
        ret = (int) ret;
        ret = ret / 100;
        System.out.printf("$%.2f", p);
        System.out.print(" invested at " + r + "% for " + y + " years compounded " + n + " times per year is ");
        System.out.printf("$%.2f.%n", ret);
    }
}
