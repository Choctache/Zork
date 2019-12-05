package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Item> inventory;

    public Player(String name){
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public void listInventory(){

    }




}
