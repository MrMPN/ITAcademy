package com.example.java.Domain;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String identifier;
    private List<Engine> engines = new ArrayList<>();

    public Rocket(String identifier, int[] engineMaxPower) throws Exception {
        //Comprobacions respecte identifier i engineAmount, si fallen es llença error
        if (identifier == null) throw new Exception("Rocket identifier is null");
        else if (engineMaxPower.length < 1) throw new Exception("Number of engines must be at least 1");
        this.identifier = identifier;
        for (int power : engineMaxPower) {
            engines.add(new Engine(power));
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getEngineAmount() {
        return engines.size();
    }

    public String getMaxPowerOfEngines() {
        StringBuilder summaryPower = new StringBuilder();
        for (Engine engine : engines) {
            summaryPower.append(engine.getMaxPower() + ",");
        }
        return summaryPower.toString();
    }

    public int getCurrentSpeed(){
        int currentSpeed = 0;
        for (Engine engine : engines){
            currentSpeed+=engine.getPower();
        }
        return currentSpeed;
    }

    private void changeSpeed(int amount){
        for (Engine engine : engines) {
            engine.changePower(amount);
        }
    }

    public void accelerate() {
        changeSpeed(+10);
    }

    public void brake() {
        changeSpeed(-10);
    }

}
