package com.company;



import java.util.ArrayList;
import java.util.List;


class Square
{
    public double length;

    public Square(double length)
    {
        this.length = length;
    }

    public double getPerimeter()
    {
        return 4 * length;
    }
}


class Rectang extends Square
{
    public double height;

    public Rectang(double length, double height)
    {
        super(length);
        this.height = height;
    }

    @Override
    public double getPerimeter()
    {
        return (length + height) * 2;
    }
}


class MyUtils
{
    public double sumPerimeter(List<Square> firures)
    {
        if(!firures.isEmpty())
        {
            double sum = 0;
            for (Square i : firures)
            {
                if(i != null)
                {
                    sum += i.getPerimeter();
                }
            }
            return sum;
        }
        return 0d;
    }
}
public class Main {

    public static void main(String[] args) {
        MyUtils myUtils = new MyUtils();
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(2));
        shapes.add(new Rectang(2, 4));
        shapes.add(null);

        System.out.println(myUtils.sumPerimeter(shapes));
    }
}
