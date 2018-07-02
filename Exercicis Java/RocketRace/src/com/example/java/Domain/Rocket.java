package com.example.java.Domain;

public class Rocket {
    private String identifier;
    private int engineAmount;

    public Rocket(String identifier, int engineAmount) throws Exception {
        //Comprobacions respecte identifier i engineAmount, si fallen es llença error
        if (identifier == null) throw new Exception("Rocket identifier is null");
        else if (engineAmount < 1) throw new Exception("Number of engines must be at least 1");
        this.identifier = identifier;
        this.engineAmount = engineAmount;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getEngineAmount() {
        return engineAmount;
    }

}
