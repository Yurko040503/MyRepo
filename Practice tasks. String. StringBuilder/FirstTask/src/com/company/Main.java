package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int number = in.nextInt();

        MyUtils obj = new MyUtils();
        obj.intToRoman(number);
    }
}
class MyUtils {
    public String intToRoman(int number) {
        StringBuilder romanString = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        if ((number < 1) || (number > 3999)) {
            throw new IllegalArgumentException("incorrect year");
        }
        for(int i = 0; i < values.length; i++) {
            while(number >= values[i]) {
                number -= values[i];
                romanString.append(romanLiterals[i]);
            }
        }
        return romanString.toString();
    }
}