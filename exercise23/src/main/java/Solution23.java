/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String bool = "";
        bool = sc.next();
        if (bool.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            bool = sc.next();
            if (bool.equals("y")) {
                System.out.print("Clean terminals and try again? ");
                System.exit(0);
            } else {
                System.out.print("Replace cables and try again? ");
                System.exit(0);
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            bool = sc.next();
            if (bool.equals("y")) {
                System.out.print("Replace the battery? ");
                System.exit(0);
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                bool = sc.next();
                if (bool.equals("y")) {
                    System.out.print("Check spark plug connections? ");
                    System.exit(0);
                } else {
                    System.out.print("Does the engine start and then die? ");
                    bool = sc.next();
                    if (bool.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        bool = sc.next();
                        if (bool.equals("y")) {
                            System.out.print("Get it in for service. ");
                            System.exit(0);
                        } else {
                            System.out.print("Check to ensure the choke is opening and closing. ");
                            System.exit(0);
                        }
                    } else {
                        System.out.print("This should no be possible. ");
                        System.exit(0);
                    }

                }
            }
        }
    }
}
