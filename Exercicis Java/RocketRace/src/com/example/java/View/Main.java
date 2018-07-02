package com.example.java.View;

import com.example.java.Application.Controller;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        try{
            controller.createRocket("32WESSDS", 3);
            controller.createRocket("LDSFJA32", 0);
        }
        catch (Exception e){
            System.out.print(e.getMessage() + "\n");
        }
        
        //Show current rocket info
        String results = controller.getCurrentInfo();
        System.out.println(results);

    }
}
