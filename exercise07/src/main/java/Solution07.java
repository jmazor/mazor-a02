/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 07
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet? ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = sc.nextInt();
        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        int f2 = width * length;
        System.out.println("The area is \n" + f2 + " square feet\n" + (f2*0.09290304) + " square meters");
    }
}
