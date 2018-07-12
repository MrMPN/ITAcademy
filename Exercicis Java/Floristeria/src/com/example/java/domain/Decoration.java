package com.example.java.domain;

public class Decoration extends Product {
    public enum Material {PLASTIC, WOOD;}
    private Material material;

    public Decoration(Material material, double price) throws Exception {
        super(price);
        if (material == null) throw new Exception();
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }


}
