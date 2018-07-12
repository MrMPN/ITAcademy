package com.example.java.application;

import com.example.java.domain.Decoration;

public class DecorationDTO {
    private Decoration.Material material;
    private double price;


    public DecorationDTO(Decoration decoration){
        this.price = decoration.getPrice();
        this.material = decoration.getMaterial();
    }

    public Decoration.Material getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}
