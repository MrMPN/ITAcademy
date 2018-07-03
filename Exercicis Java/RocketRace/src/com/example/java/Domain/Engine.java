package com.example.java.Domain;

public class Engine {
    private int power;
    private int maxPower;

    public Engine(int maxPower) throws Exception {
        if (maxPower < 1) throw new Exception("Max power of the Engine must be higher than 0");
        this.maxPower = maxPower;
    }

    public int getPower() {
        return power;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void changePower(int powerDifferential) {
        this.power += powerDifferential;
        if (power > maxPower) {
            power = maxPower;
        } else if (power < 0) {
           power = 0;
        }
    }
}
