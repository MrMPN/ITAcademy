package com.example.java.Application;

import com.example.java.Domain.Rocket;
import java.util.ArrayList;


public class Controller {

    //ArrayList on anirem guarden els nous coets
    private static ArrayList<Rocket> rockets = new ArrayList<>();

    //Metode per crear un nou coet amb la info donada
    public void createRocket(String identifier, int[] listOfEnginePower) throws Exception {
        Rocket rocket = new Rocket(identifier, listOfEnginePower);
        rockets.add(rocket);
    }

    public void addEngine(String identifier, int power) throws Exception{
        for (Rocket r : rockets){
            if (r.getIdentifier().equals(identifier)){
                r.addEngine(power);
            }
        }
    }

    //Metode per convertir la info sobre els coets en una ArrayList<String>
    public String getCurrentInfo(){
        StringBuilder summaryLine = new StringBuilder();
        boolean first = true;
        for (Rocket rocket: rockets){
            if (first){ first = false;}
            else{ summaryLine.append("\n");}
            String identifier = rocket.getIdentifier();
            int numberOfEngines = rocket.getEngineAmount();
            String powerOfEngines = rocket.getPowerOfEngines();
            summaryLine.append("Rocket " + identifier + ". Number of engines: " + numberOfEngines);
            summaryLine.append(". Power of engines: " + powerOfEngines);
        }
        return summaryLine.toString();
    }
}
