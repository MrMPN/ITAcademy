package com.example.java.Domain;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String identifier;
    private List<Engine> engines = new ArrayList<>();

//    public Rocket(String identifier) throws Exception{
//        if (identifier == null) throw new Exception("Rocket identifier is null");
//        this.identifier = identifier;
//    }

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
        return engines.size();
    }

    public void addEngine(int power) throws Exception{
        engines.add(new Engine(power));
    }

    public String getPowerOfEngines(){
        StringBuilder summaryPower = new StringBuilder();
        boolean first = true;
        for (Engine engine: engines){
            if (first){first=false;}
            else{summaryPower.append(",");}
            summaryPower.append(engine.getPower());
        }
        return summaryPower.toString();
    }
}
