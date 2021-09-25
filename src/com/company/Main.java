package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Варіант завдання №7");
        Scanner s = new Scanner(System.in);
        double a, b, x, y, z;

        System.out.print("Введіть значення a: \n");
        a = s.nextDouble();
        System.out.print("Введіть значення b: \n");
        b = s.nextDouble();
        System.out.print("Введіть значення x: \n");
        x = s.nextDouble();

        System.out.println("\n1 приклад: ");
        y = Math.pow(Math.sin(Math.pow((Math.pow(x,2) + a),2)) ,3) - Math.sqrt(x/b);
        System.out.println("y = " + y);

        System.out.println("\n2 приклад: ");
        z = (Math.pow(x, 2) / a) + Math.cos(Math.pow(x + b, 3));
        System.out.println("z = " + z);
    }
}
