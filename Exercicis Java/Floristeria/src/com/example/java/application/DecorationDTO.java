package com.example.java.application;

import com.example.java.domain.Decoration;

public class DecorationDTO {
    private String material;
    private double price;


    public DecorationDTO(Decoration decoration){
        this.price = decoration.getPrice();
        this.material = decoration.getMaterial();
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}
