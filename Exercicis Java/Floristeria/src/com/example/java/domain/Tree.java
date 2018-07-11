package com.example.java.domain;

public class Tree extends Product {
    private double height;

    public Tree(double height, double price) throws Exception {
        super(price);
        if (height <= 0 ) throw new Exception();
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
