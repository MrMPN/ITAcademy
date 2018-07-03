package com.example.java.Application;

import com.example.java.Domain.Rocket;

import java.util.ArrayList;
import java.util.List;


public class Controller {

    //ArrayList on anirem guarden els nous coets
    private static List<Rocket> rockets = new ArrayList<>();

    //Metode per crear un nou coet amb la info donada
    public void createRocket(String identifier, int[] listOfEnginePower) throws Exception {
        Rocket rocket = new Rocket(identifier, listOfEnginePower);
        rockets.add(rocket);
    }

    public void addEngine(String identifier, int power) throws Exception {
        for (Rocket r : rockets) {
            if (r.getIdentifier().equals(identifier)) {
                r.addEngine(power);
            }
        }
    }

    //Metode per convertir la info sobre els coets en una ArrayList<String>
    public String getCurrentInfo() {
        StringBuilder summaryLine = new StringBuilder();
        for (Rocket rocket : rockets) {
            summaryLine.append("Rocket " + rocket.getIdentifier());
            summaryLine.append(". Number of engines: " + rocket.getEngineAmount());
            summaryLine.append(". Power of engines: " + rocket.getPowerOfEngines());
            summaryLine.append("\n");
        }
        return summaryLine.toString();
    }


}
