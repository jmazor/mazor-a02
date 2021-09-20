/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Justin Mazor
 */


import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = 0;
        n1 = sc.nextInt();
        int n2 = 0;
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = 0;
        n3 = sc.nextInt();
        int largest = 0;

        if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.print("Error Numbers Equal");
            System.exit(0);
        }
        else if (n1 > n2 && n1 > n3) {
            largest = n1;
        }

        else if (n2 > n1 && n2 > n3) {
            largest = n2;
        }
        else {
            largest = n2;
        }
        System.out.print("The largest number is " + largest + ".");
    }
}
