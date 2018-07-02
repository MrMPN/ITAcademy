package com.example.java.Application;

import com.example.java.Domain.Rocket;
import java.util.ArrayList;

public class Controller {

    //ArrayList on anirem guarden els nous coets
    private static ArrayList<Rocket> rockets = new ArrayList<>();

    //Metode per crear un nou coet amb la info donada
    public void createRocket(String identifier, int engines) throws Exception {
        Rocket rocket = new Rocket(identifier, engines);
        rockets.add(rocket);
    }

    //Metode per convertir la info sobre els coets en una ArrayList<String>
    public String getCurrentInfo(){
        StringBuilder summaryLine = new StringBuilder();
        for (Rocket rocket: rockets){
            String identifier = rocket.getIdentifier();
            int engines = rocket.getEngineAmount();
            summaryLine.append("Rocket " + identifier + ". Number of engines: " + engines + "\n");
        }
        String finalSummary = summaryLine.toString();
        return finalSummary;
    }
}
