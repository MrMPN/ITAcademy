package com.example.java.domain;

public class Flower extends Product {
    private String colour;

    public Flower(String colour, double price) throws Exception {
        super(price);
        if (colour.equals("")) throw new Exception();
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

}
