package com.example.java.Domain;

public class Engine{
    private int power;

    public Engine(int power) throws Exception{
        if (power < 1) throw new Exception("Power of the Engine must be higher than 0");
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
