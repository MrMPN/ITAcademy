package com.example.java.domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Florist(String name) throws Exception {
        if (name.equals("")) throw new Exception();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
