package com.example.java.Application;

import com.example.java.Domain.Rocket;

import java.util.ArrayList;
import java.util.List;


public class Controller {

    //ArrayList on anirem guarden els nous coets
    private static List<Rocket> rockets = new ArrayList<>();

    //Metode per crear un nou coet amb la info donada
    public void createRocket(String identifier, int[] engineMaxPower) throws Exception {
        Rocket rocket = new Rocket(identifier, engineMaxPower);
        rockets.add(rocket);
    }

    private Rocket findRocketByIdentifier(String identifier) throws Exception{
        for (Rocket r : rockets) {
            if (r.getIdentifier().equals(identifier)) {
                return r;
            }
        }
        throw new Exception("Rocket not found");
    }

    public void accelerateRocket(String identifier, int times) throws Exception{
        Rocket rocket = findRocketByIdentifier(identifier);
        for (int i =0; i < times; i++){
            rocket.accelerate();
        }
    }

    public void brakeRocket(String identifier, int times) throws Exception{
        Rocket rocket = findRocketByIdentifier(identifier);
        for (int i =0; i < times; i++){
            rocket.brake();
        }
    }

    //Metode per retornar info sobre potencia maxima i numero de propulsors
    public String getCurrentInfo() {
        StringBuilder summaryLine = new StringBuilder();
        for (Rocket rocket : rockets) {
            summaryLine.append("Rocket " + rocket.getIdentifier());
            summaryLine.append(". Number of engines: " + rocket.getEngineAmount());
            summaryLine.append(". Max power of engines: " + rocket.getMaxPowerOfEngines());
            summaryLine.setLength(summaryLine.length() - 1);
            summaryLine.append("\n");
        }
        return summaryLine.toString();
    }

    //Metode per retornar velocitat actual dels coets
    public String getcurrentSpeed(){
        StringBuilder summaryLine = new StringBuilder();
        for (Rocket rocket: rockets){
            summaryLine.append("Current Speed: " + rocket.getCurrentSpeed());
            summaryLine.append("\n");
        }
        summaryLine.setLength(summaryLine.length() - 1);
        return summaryLine.toString();
    }
}
