package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year: ");
        int century = in.nextInt();
        System.out.println("The century - " + century(century));
    }

    public static int century(int year)
    {
        if(year%100 == 0)
        {
            return year/100;
        }
        else
        {
            return year/100 + 1;
        }
    }
}
