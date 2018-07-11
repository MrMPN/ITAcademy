package com.example.java.view;

import com.example.java.application.DecorationDTO;
import com.example.java.application.FloristController;
import com.example.java.application.FlowerDTO;
import com.example.java.application.TreeDTO;

import java.util.List;

public class Main {

    private static FloristController controller = new FloristController();

    public static void main(String[] args) {

        try {
            controller.createFlorist("Pepita");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            controller.addDecoration("wood", 12.4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            controller.addFlower("Blue", 8.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            controller.addTree(12.35, 20.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(getStock());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getStock () throws Exception {

        List<DecorationDTO> decorationDTOS = controller.getAllDecorations();
        List<FlowerDTO> flowerDTOS = controller.getAllFlowers();
        List<TreeDTO> treeDTOS = controller.getAllTrees();

        String stock = "Arboles: " + treeDTOS.size() + "\n" +
                "Flores: " + flowerDTOS.size() + "\n" +
                "Decoraciones: " + decorationDTOS.size();
        return stock;
    }
}
