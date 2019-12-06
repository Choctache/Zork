package com.company;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Item> inventory;
    private int location;
    private int direction;

    public int getDirection() {
        return direction;
    }

    public Player(String name, ArrayList<Item> inventory){
        this.name = name;
        this.inventory = inventory;
        this.location = 1;
        this.direction = 1;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }


    public void listInventory(){
        System.out.println("What's in your pocket: ");
        for(Item item : getInventory()){
            System.out.println("\t- " + item.getName() + ": " + item.getDescription());
        }
    }

    public int getLocation() {
        return location;
    }


    public void whoAmI(){
        System.out.println("Who you are: " + getName());
    }

    public void addItemToInventory(Item item){
        this.inventory.add(item);
    }


}
