/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month = 0;
        while(sc.hasNext()) {
            if (sc.hasNextInt() ) {
                month = sc.nextInt();
                if (month > 0 && month < 13) {
                    break;
                }
                else {
                    System.out.print("Please enter a number 1-12: ");
                }

            } else {
                System.out.print("Enter a number 1-12: ");
                sc.next();
            }
        }
        String monthS = "";
        switch (month) {
            case 1:  monthS = "January";
                break;
            case 2:  monthS = "February";
                break;
            case 3:  monthS = "March";
                break;
            case 4:  monthS = "April";
                break;
            case 5:  monthS = "May";
                break;
            case 6:  monthS = "June";
                break;
            case 7:  monthS = "July";
                break;
            case 8:  monthS = "August";
                break;
            case 9:  monthS = "September";
                break;
            case 10: monthS = "October";
                break;
            case 11: monthS = "November";
                break;
            case 12: monthS = "December";
                break;
        }
        System.out.print("The name of the month is " + monthS);
    }
}
