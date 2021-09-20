/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        String result = ( age > 15)
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive."
                ;
        System.out.print(result);
    }
}
