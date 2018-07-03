package com.example.java.View;

import com.example.java.Application.Controller;


public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        //Provem de crear dos coets nous, amb les potencies dels seus propulsors
        //Si falla, imprimim el missatge
        try{
            controller.createRocket("32WESSDS", new int[] {10,30,80});
            controller.createRocket("LDSFJA32", new int[] {30,40,50,50,30,10});
        }
        catch (Exception e){
            System.out.print(e.getMessage() + "\n");
        }

        //Intentem afegir un nou propulsor a un coet que especifiquem
        //Si falla, imprimim el missatge
//        try {
//            controller.addEngine("32WESSDS", 100);
//        } catch (Exception e) {
//            System.out.print(e.getMessage() + "\n");
//        }

        //Show current rocket info
        String results = controller.getCurrentInfo();
        System.out.println(results);
    }
}
