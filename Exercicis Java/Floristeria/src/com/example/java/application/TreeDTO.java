package com.example.java.application;

import com.example.java.domain.Tree;

public class TreeDTO {
    private double height;
    private double price;


    public TreeDTO(Tree tree){
        this.price = tree.getPrice();
        this.height = tree.getHeight();
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }
}
