package com.example.java.application.dto;

import com.example.java.domain.Flower;

public class FlowerDTO {
    private String colour;
    private double price;


    public FlowerDTO(Flower flower){
        this.price = flower.getPrice();
        this.colour = flower.getColour();
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

}
