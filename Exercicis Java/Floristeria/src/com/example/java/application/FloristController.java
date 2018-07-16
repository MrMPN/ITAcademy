package com.example.java.application;


import com.example.java.application.dto.DecorationDTO;
import com.example.java.application.dto.FlowerDTO;
import com.example.java.application.dto.TreeDTO;
import com.example.java.domain.*;
import com.example.java.persistance.FloristRepository;

import java.util.ArrayList;
import java.util.List;

public class FloristController {

    private FloristRepository repository = new FloristRepository();


    public FloristController (){
    }

    public void createFlorist (String name) throws Exception {
        Florist florist = new Florist(name);
        repository.saveFlorist(florist);
    }

    public void addFlower(String colour, double price) throws Exception {
        Flower flower = new Flower(colour, price);
        Florist florist = repository.getFlorist();
        florist.addProduct(flower);
    }

    public void addTree(double height, double price) throws Exception {
        Tree tree = new Tree(height, price);
        Florist florist = repository.getFlorist();
        florist.addProduct(tree);
    }

    public void addDecoration(Decoration.Material material, double price) throws Exception {
        Decoration decoration = new Decoration(material, price);
        Florist florist = repository.getFlorist();
        florist.addProduct(decoration);
    }

    public List<TreeDTO> getAllTrees() throws Exception {
        List<TreeDTO> trees = new ArrayList<>();
        Florist florist = repository.getFlorist();
        List<Product> products = florist.getProducts();
        for (Product p : products) {
            if(p instanceof Tree){
                trees.add(new TreeDTO((Tree) p));
            }
        }
        return trees;
    }

    public List<FlowerDTO> getAllFlowers() throws Exception {
        List<FlowerDTO> flowers = new ArrayList<>();
        Florist florist = repository.getFlorist();
        List<Product> products = florist.getProducts();
        for (Product p : products) {
            if(p instanceof Flower){
                flowers.add(new FlowerDTO((Flower) p));
            }
        }
        return flowers;
    }

    public List<DecorationDTO> getAllDecorations() throws Exception {
        List<DecorationDTO> decorations = new ArrayList<>();
        Florist florist = repository.getFlorist();
        List<Product> products = florist.getProducts();
        for (Product p : products) {
            if(p instanceof Decoration){
                decorations.add(new DecorationDTO((Decoration) p));
            }
        }
        return decorations;
    }

    public String getFloristName() throws Exception{
        return repository.getFlorist().getName();
    }


}
