/*
 *  UCF COP3330 Fall 2021 Assignment 07 Solution
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = sc.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = sc.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices =  sc.nextInt();
        System.out.println(people + " people with " + pizzas + " pizzas (" + (slices * pizzas) + " slices)");
        System.out.println("Each person gets " + (slices * pizzas) / people + " pieces of pizza.");
        System.out.println("There are " + ((slices*pizzas) % people) + " leftover pieces");
    }
}
