package com.example.java.domain;

public class Decoration extends Product {
    private String material;

    public Decoration(String material, double price) throws Exception {
        super(price);
        if (material == null) throw new Exception();
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
