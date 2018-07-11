package com.example.java.domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {
    private String name;
    private List<Product> listProducts = new ArrayList<>();

    public Florist(String name) throws Exception {
        if (name == null) throw new Exception();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void addProduct(Product product){
        listProducts.add(product);
    }
}
