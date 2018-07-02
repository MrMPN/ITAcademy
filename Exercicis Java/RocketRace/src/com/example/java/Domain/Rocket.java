package com.example.java.Domain;

import java.util.ArrayList;

public class Rocket {
    private String identifier;
    private ArrayList<Engine> Engines = new ArrayList<>();

    public Rocket(String identifier) throws Exception{
        if (identifier == null) throw new Exception("Rocket identifier is null");
        this.identifier = identifier;
    }

    public Rocket(String identifier, int[] listOfEnginePower) throws Exception {
        //Comprobacions respecte identifier i engineAmount, si fallen es llença error
        if (identifier == null) throw new Exception("Rocket identifier is null");
        else if (listOfEnginePower.length < 1) throw new Exception("Number of engines must be at least 1");
        this.identifier = identifier;
        for (int power: listOfEnginePower){
            addEngine(power);
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getEngineAmount() {
        return Engines.size();
    }

    public void addEngine(int power) throws Exception{
        Engines.add(new Engine(power));
    }

    public String getPowerOfEngines(){
        StringBuilder summaryPower = new StringBuilder();
        boolean first = true;
        for (Engine engine: Engines){
            if (first){first=false;}
            else{summaryPower.append(",");}
            summaryPower.append(engine.getPower());
        }
        return summaryPower.toString();
    }
}
