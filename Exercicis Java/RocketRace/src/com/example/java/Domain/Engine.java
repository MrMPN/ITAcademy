package com.example.java.Domain;

public class Engine {
    private int power;
    private int maxPower;

    public Engine(int power) throws Exception {
        if (power < 1) throw new Exception("Max power of the Engine must be higher than 0");
        this.maxPower = power;
    }

    public int getPower() {
        return power;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void changePower(int powerDifferential) {
        this.power += powerDifferential;
        if (power < 0) {
            power = 0;
        } else if (power > maxPower) {
            power = maxPower;
        }
    }
}
