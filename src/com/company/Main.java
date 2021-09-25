package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Exercise7 task = new Exercise7();
        task.Input();
    }

    static class Exercise7
    {
        double a, b, x, y, z;
        Scanner s = new Scanner(System.in);

        void Input()
        {
            System.out.println("\nВаріант завдання №7");

            System.out.print("Введіть значення a: ");
            a = s.nextDouble();
            System.out.print("Введіть значення b: ");
            b = s.nextDouble();
            System.out.print("Введіть значення x: ");
            x = s.nextDouble();
            Output();
        }

        void Solve()
        {
            y = Math.pow(Math.sin(Math.pow((Math.pow(x,2) + a),2)) ,3) - Math.sqrt(x/b);
            z = (Math.pow(x, 2) / a) + Math.cos(Math.pow(x + b, 3));
        }

        void Output()
        {
            Solve();
            System.out.println("\n  Розв'язок першого прикладу: ");
            System.out.println("y = " + y);
            System.out.println("Розв'язок другого прикладу : ");
            System.out.println("z = " + z);
        }
    }
}
