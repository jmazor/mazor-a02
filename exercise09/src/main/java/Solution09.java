/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 09
 *  Copyright 2021 Justin Mazor
 */
import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet? ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = sc.nextInt();
        int f2 = length * width;
        int gallons;
        if (f2%350 != 0) {
            gallons = (f2/350) + 1;
        } else
            gallons = f2/350;
        System.out.println("You will need to purchase " + gallons + " gallons of point to cover " + f2 + " square feet.");

    }
}
