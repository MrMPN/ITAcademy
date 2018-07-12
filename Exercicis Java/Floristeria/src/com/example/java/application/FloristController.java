package com.example.java.application;


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
        repository.setFlorist(florist);
    }

    public void addFlower(String colour, double price) throws Exception {
        Flower flower = new Flower(colour, price);
        repository.getFlorist().addProduct(flower);
    }

    public void addTree(double height, double price) throws Exception {
        Tree tree = new Tree(height, price);
        repository.getFlorist().addProduct(tree);
    }

    public void addDecoration(Decoration.Material material, double price) throws Exception {
        Decoration decoration = new Decoration(material, price);
        repository.getFlorist().addProduct(decoration);
    }

    public List<TreeDTO> getAllTrees() throws Exception {
        List<TreeDTO> listTrees = new ArrayList<>();
        List<Product> products = repository.getFlorist().getListProducts();
        for (Product p : products) {
            if(p instanceof Tree){
                listTrees.add(new TreeDTO((Tree) p));
            }
        }
        return listTrees;
    }

    public List<FlowerDTO> getAllFlowers() throws Exception {
        List<FlowerDTO> listFlowers = new ArrayList<>();
        List<Product> products = repository.getFlorist().getListProducts();
        for (Product p : products) {
            if(p instanceof Flower){
                listFlowers.add(new FlowerDTO((Flower) p));
            }
        }
        return listFlowers;
    }

    public List<DecorationDTO> getAllDecorations() throws Exception {
        List<DecorationDTO> listDecorations = new ArrayList<>();
        List<Product> products = repository.getFlorist().getListProducts();
        for (Product p : products) {
            if(p instanceof Decoration){
                listDecorations.add(new DecorationDTO((Decoration) p));
            }
        }
        return listDecorations;
    }

    public String getFloristName() throws Exception{
        return repository.getFlorist().getName();
    }


}
