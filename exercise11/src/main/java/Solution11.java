/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Justin Mazor
 */


import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        System.out.print("How many euros are you exchanging? ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = sc.nextDouble();
        double temp = rate * num;
        temp = (temp * 100) + 0.999999999;
        double ret = (int) temp;
        ret = ret/100;
        System.out.print(num + "euros at an exchange rate of " + rate + " is\n");
        System.out.print(ret + " U.S. dollars.");



    }
}
