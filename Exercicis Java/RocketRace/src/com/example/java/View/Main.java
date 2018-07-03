package com.example.java.View;

import com.example.java.Application.Controller;


public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        // 1. Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”
        try{
            controller.createRocket("32WESSDS", new int[] {10,30,80});
            controller.createRocket("LDSFJA32", new int[] {30,40,50,50,30,10});
        }
        catch (Exception e){
            System.out.print(e.getMessage() + "\n");
        }

        //2. Mostrar a pantalla el codi dels coets, el número de propulsors que té
        //i la potència màxima de cada propulsor.
        System.out.println(controller.getCurrentInfo() + "\n");

        //3. Mostrar la velocitat actual del coets
        System.out.println(controller.getcurrentSpeed() + "\n");

        //4. Accelerar 3 cops
        try {
            controller.accelerateRocket("32WESSDS", 3);
            controller.accelerateRocket("LDSFJA32", 3);
        } catch (Exception e) {
            System.out.print(e.getMessage() + "\n");
        }

        //5. Mostrar velocitat actual
        System.out.println(controller.getcurrentSpeed() + "\n");

        //6. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
        try {
            controller.brakeRocket("32WESSDS", 5);
            controller.accelerateRocket("LDSFJA32", 7);
        } catch (Exception e) {
            System.out.print(e.getMessage() + "\n");
        }

        //7. Mostrar velocitat actual
        System.out.println(controller.getcurrentSpeed() + "\n");

        //8. Accelerar 15 cops amb els dos coets.
        try {
            controller.accelerateRocket("32WESSDS", 15);
            controller.accelerateRocket("LDSFJA32", 15);
        } catch (Exception e) {
            System.out.print(e.getMessage() + "\n");
        }

        //9. Mostrar velocitat actual
        System.out.println(controller.getcurrentSpeed() + "\n");
    }
}
