package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int digits = in.nextInt();
        System.out.println("The sum of the digits = " + sumOfDigits(digits));
    }

    public static int sumOfDigits(int number)
    {
        int result = 0;
        while(number > 0)
        {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
