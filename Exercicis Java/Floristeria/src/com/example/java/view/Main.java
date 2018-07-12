package com.example.java.view;

import com.example.java.application.DecorationDTO;
import com.example.java.application.FloristController;
import com.example.java.application.FlowerDTO;
import com.example.java.application.TreeDTO;
import com.example.java.domain.Decoration;

import java.util.List;

public class Main {

    private static FloristController controller = new FloristController();

    public static void main(String[] args) {

        try {
            controller.createFlorist("Best Flowers in Town");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            controller.addDecoration(Decoration.Material.PLASTIC, 12.4);
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
            controller.addTree(8.50, 13.0);
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

        String stock = controller.getFloristName() + "\n" +
                "Trees: " + treeDTOS.size() + "\n" +
                "Flowers: " + flowerDTOS.size() + "\n" +
                "Decorations: " + decorationDTOS.size();
        return stock;
    }
}
