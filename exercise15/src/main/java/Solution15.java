/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the password? ");
        String pass = sc.next();
        if (pass.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }
}
