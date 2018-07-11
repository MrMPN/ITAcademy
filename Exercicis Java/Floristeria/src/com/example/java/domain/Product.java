package com.example.java.domain;

public abstract class Product {
    private double price;

    public Product(double price) throws Exception {
        if (price <= 0) throw new Exception();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
