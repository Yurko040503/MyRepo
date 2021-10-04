package com.company;

import java.sql.SQLOutput;

class Product{
    private String name;
    private double price;
    private static int k;


    public Product(String _name, double _price){
        name = _name;
        price = _price;
        k++;
    }

    public Product(){
        k++;
        return;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int count(){
        return k;
    }

}

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Pen", 2.2);
        Product p2 = new Product();
        Product p3 = new Product("Notebook", 8.25);

        int countOfproducts = Product.count();
    }
}