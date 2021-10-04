package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year: ");
        int years = in.nextInt();
        if(isLeapYear(years))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a leap Year");
        }
    }

    public static boolean isLeapYear(int year)
    {
        if(year%4 == 0 && year%100 != 0 || year % 400 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
